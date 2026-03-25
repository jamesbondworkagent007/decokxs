package org.kethereum.crypto;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Provider;
import java.security.SecureRandomSpi;
import java.security.Security;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C60099zvg;
import o.InterfaceC60100zvh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class LinuxSecureRandom extends SecureRandomSpi {
    public static final ActionBar Companion = new ActionBar(null);
    private static final InterfaceC60100zvh log;
    private static final FileInputStream urandom;
    private final DataInputStream dis = new DataInputStream(urandom);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.security.SecureRandomSpi
    public void engineSetSeed(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
    }

    public static final class LinuxSecureRandomProvider extends Provider {
        public LinuxSecureRandomProvider() {
            super("LinuxSecureRandom", 1.0d, "A Linux specific random number provider that uses /dev/urandom");
            put("SecureRandom.LinuxSecureRandom", LinuxSecureRandom.class.getName());
        }

        @Override // java.security.Provider, java.util.Hashtable, java.util.Map
        public final Set<Map.Entry<Object, Object>> entrySet() {
            return getEntries();
        }

        public Set<Map.Entry<Object, Object>> getEntries() {
            return super.entrySet();
        }

        public Set<Object> getKeys() {
            return super.keySet();
        }

        public int getSize() {
            return super.size();
        }

        public Collection<Object> getValues() {
            return super.values();
        }

        @Override // java.security.Provider, java.util.Hashtable, java.util.Map
        public final Set<Object> keySet() {
            return getKeys();
        }

        @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
        public final int size() {
            return getSize();
        }

        @Override // java.security.Provider, java.util.Hashtable, java.util.Map
        public final Collection<Object> values() {
            return getValues();
        }
    }

    @Override // java.security.SecureRandomSpi
    public void engineNextBytes(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
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

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: org.kethereum.crypto.LinuxSecureRandom.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
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
}
