package io.miragon.publicplandemocore.application.service;

import io.miragon.publicplandemocore.application.port.in.GeneratePDFCommand;
import io.miragon.publicplandemocore.application.port.in.GeneratePDFUseCase;
import io.miragon.publicplandemocore.application.port.out.GeneratePDFPort;

@AllArgsConstructor
public class GeneratePDFService implements GeneratePDFUseCase {

    private final GeneratePDFPort generatePDFPort;

    @Override
    @Worker(type="generatePDF")
    public byte[] generatePDF(GeneratePDFCommand generatePDFCommand) {
        return generatePDFPort.generatePDF(generatePDFCommand.getFirstname(), generatePDFCommand.getLastname());
    }
}
