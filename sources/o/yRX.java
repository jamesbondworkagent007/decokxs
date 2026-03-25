package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface yRX {
    public static final yRX KWHzl = new yRX() { // from class: o.yRX.4
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void OLrzqt(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.yRX
        public void AEQbTJ(@NotNull InterfaceC56836yUc interfaceC56836yUc, @NotNull InterfaceC56687yOp interfaceC56687yOp) {
            if (interfaceC56836yUc == null) {
                OLrzqt(1);
            }
            if (interfaceC56687yOp == null) {
                OLrzqt(2);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.yRX
        public InterfaceC56658yNn KWHzl(@NotNull C56933yXs c56933yXs) {
            if (c56933yXs != null) {
                return null;
            }
            OLrzqt(0);
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.yRX
        public void KWHzl(@NotNull yTY yty, @NotNull InterfaceC56660yNp interfaceC56660yNp) {
            if (yty == null) {
                OLrzqt(3);
            }
            if (interfaceC56660yNp == null) {
                OLrzqt(4);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.yRX
        public void OLrzqt(@NotNull yTT ytt, @NotNull InterfaceC56658yNn interfaceC56658yNn) {
            if (ytt == null) {
                OLrzqt(7);
            }
            if (interfaceC56658yNn == null) {
                OLrzqt(8);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.yRX
        public void copydefault(@NotNull yTW ytw, @NotNull InterfaceC56676yOe interfaceC56676yOe) {
            if (ytw == null) {
                OLrzqt(5);
            }
            if (interfaceC56676yOe == null) {
                OLrzqt(6);
            }
        }
    };

    void AEQbTJ(@NotNull InterfaceC56836yUc interfaceC56836yUc, @NotNull InterfaceC56687yOp interfaceC56687yOp);

    InterfaceC56658yNn KWHzl(@NotNull C56933yXs c56933yXs);

    void KWHzl(@NotNull yTY yty, @NotNull InterfaceC56660yNp interfaceC56660yNp);

    void OLrzqt(@NotNull yTT ytt, @NotNull InterfaceC56658yNn interfaceC56658yNn);

    void copydefault(@NotNull yTW ytw, @NotNull InterfaceC56676yOe interfaceC56676yOe);
}
