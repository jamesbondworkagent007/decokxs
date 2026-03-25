package o;

/* JADX INFO: renamed from: o.yOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56686yOo {
    public static final InterfaceC56686yOo copydefault = new InterfaceC56686yOo() { // from class: o.yOo.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void AEQbTJ(int i) {
            throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NO_SOURCE";
        }

        @Override // o.InterfaceC56686yOo
        public InterfaceC56684yOm copydefault() {
            InterfaceC56684yOm interfaceC56684yOm = InterfaceC56684yOm.EZpvd;
            if (interfaceC56684yOm == null) {
                AEQbTJ(0);
            }
            return interfaceC56684yOm;
        }
    };

    InterfaceC56684yOm copydefault();
}
