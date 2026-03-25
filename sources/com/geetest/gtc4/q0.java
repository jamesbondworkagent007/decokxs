package com.geetest.gtc4;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateParsingException;
import java.util.HashSet;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes21.dex */
public abstract class q0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] a(f fVar) throws CertificateParsingException {
        if (fVar == null || !(fVar instanceof i2)) {
            throw new CertificateParsingException("Expected DEROctetString");
        }
        return ((s) fVar).f501a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int b(f fVar) {
        if (fVar instanceof n) {
            n nVar = (n) fVar;
            nVar.getClass();
            BigInteger bigInteger = new BigInteger(nVar.f479a);
            if (bigInteger.compareTo(BigInteger.valueOf(2147483647L)) > 0 || bigInteger.compareTo(BigInteger.ZERO) < 0) {
                throw new CertificateParsingException("INTEGER out of bounds");
            }
            return bigInteger.intValue();
        }
        if (!(fVar instanceof h)) {
            throw new CertificateParsingException("Integer value expected, " + fVar.getClass().getName() + " found.");
        }
        h hVar = (h) fVar;
        hVar.getClass();
        BigInteger bigInteger2 = new BigInteger(hVar.f454a);
        if (bigInteger2.compareTo(BigInteger.valueOf(2147483647L)) > 0 || bigInteger2.compareTo(BigInteger.ZERO) < 0) {
            throw new CertificateParsingException("INTEGER out of bounds");
        }
        return bigInteger2.intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Long c(f fVar) throws CertificateParsingException {
        if (!(fVar instanceof n)) {
            throw new CertificateParsingException("Integer value expected, " + fVar.getClass().getName() + " found.");
        }
        n nVar = (n) fVar;
        nVar.getClass();
        BigInteger bigInteger = new BigInteger(nVar.f479a);
        if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0 || bigInteger.compareTo(BigInteger.ZERO) < 0) {
            throw new CertificateParsingException("INTEGER out of bounds");
        }
        return Long.valueOf(bigInteger.longValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String d(f fVar) throws CertificateParsingException {
        if (fVar instanceof s) {
            return new String(((s) fVar).f501a, StandardCharsets.UTF_8);
        }
        throw new CertificateParsingException("Expected octet string, found ".concat(fVar.getClass().getName()));
    }

    public static w a(byte[] bArr) throws CertificateParsingException {
        try {
            m mVar = new m(bArr);
            try {
                w wVarA = mVar.a();
                mVar.close();
                return wVarA;
            } finally {
            }
        } catch (IOException e) {
            throw new CertificateParsingException("Failed to parse Encodable", e);
        }
    }

    public static z a(m mVar) throws CertificateParsingException, IOException {
        w wVarA = mVar.a();
        if (wVarA instanceof s) {
            m mVar2 = new m(((s) wVarA).f501a);
            try {
                w wVarA2 = mVar2.a();
                if (wVarA2 instanceof z) {
                    z zVar = (z) wVarA2;
                    mVar2.close();
                    return zVar;
                }
                throw new CertificateParsingException("Expected sequence, found ".concat(wVarA2.getClass().getName()));
            } catch (Throwable th) {
                try {
                    mVar2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw new CertificateParsingException("Expected octet stream, found ".concat(wVarA.getClass().getName()));
    }

    public static z b(byte[] bArr) {
        try {
            m mVar = new m(bArr);
            try {
                z zVarA = a(mVar);
                mVar.close();
                return zVarA;
            } finally {
            }
        } catch (IOException e) {
            throw new CertificateParsingException("Failed to parse SEQUENCE", e);
        }
    }

    public static void a(w wVar) {
        if (wVar instanceof b0) {
            HashSet hashSet = new HashSet();
            b0 b0Var = (b0) wVar;
            int i = 0;
            while (true) {
                f[] fVarArr = b0Var.f423a;
                if (i >= fVarArr.length) {
                    return;
                }
                if (i < fVarArr.length) {
                    hashSet.add(Integer.valueOf(b((n) fVarArr[i])));
                    i++;
                } else {
                    throw new NoSuchElementException();
                }
            }
        } else {
            throw new CertificateParsingException("Expected set, found ".concat(wVar.getClass().getName()));
        }
    }
}
