package org.web3j.crypto;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Provider;
import java.security.SecureRandomSpi;
import java.security.Security;
import o.C60099zvg;
import o.InterfaceC60100zvh;

/* JADX INFO: loaded from: classes25.dex */
public class LinuxSecureRandom extends SecureRandomSpi {
    private static final InterfaceC60100zvh log;
    private static final FileInputStream urandom;
    private final DataInputStream dis = new DataInputStream(urandom);

    @Override // java.security.SecureRandomSpi
    public void engineSetSeed(byte[] bArr) {
    }

    public static class LinuxSecureRandomProvider extends Provider {
        public LinuxSecureRandomProvider() {
            super("LinuxSecureRandom", 1.0d, "A Linux specific random number provider that uses /dev/urandom");
            put("SecureRandom.LinuxSecureRandom", LinuxSecureRandom.class.getName());
        }
    }

    static {
        InterfaceC60100zvh interfaceC60100zvhAEQbTJ = C60099zvg.AEQbTJ((Class<?>) LinuxSecureRandom.class);
        log = interfaceC60100zvhAEQbTJ;
        try {
            File file = new File("/dev/urandom");
            FileInputStream fileInputStream = new FileInputStream(file);
            urandom = fileInputStream;
            if (fileInputStream.read() == -1) {
                throw new RuntimeException("/dev/urandom not readable?");
            }
            if (Security.insertProviderAt(new LinuxSecureRandomProvider(), 1) != -1) {
                interfaceC60100zvhAEQbTJ.info("Secure randomness will be read from {} only.", file);
            } else {
                interfaceC60100zvhAEQbTJ.info("Randomness is already secure.");
            }
        } catch (FileNotFoundException e) {
            log.error("/dev/urandom does not appear to exist or is not openable");
            throw new RuntimeException(e);
        } catch (IOException e2) {
            log.error("/dev/urandom does not appear to be readable");
            throw new RuntimeException(e2);
        }
    }

    @Override // java.security.SecureRandomSpi
    public void engineNextBytes(byte[] bArr) {
        try {
            this.dis.readFully(bArr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.security.SecureRandomSpi
    public byte[] engineGenerateSeed(int i) {
        byte[] bArr = new byte[i];
        engineNextBytes(bArr);
        return bArr;
    }
}
