package org.kethereum.crypto.impl.hashing;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public abstract class DigestParams {
    public final int AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int) A[MD:(int):void (m)] call: org.kethereum.crypto.impl.hashing.DigestParams.<init>(int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DigestParams(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AEQbTJ;
    }

    public static final class Sha256 extends DigestParams {
        public static final Sha256 EZpvd = new Sha256();

        private Sha256() {
            super(256, null);
        }
    }

    public DigestParams(int i) {
        this.AEQbTJ = i;
    }

    public static final class Sha512 extends DigestParams {
        public static final Sha512 EZpvd = new Sha512();

        private Sha512() {
            super(512, null);
        }
    }
}
