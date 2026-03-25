package o;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59148zba {
    public static final InterfaceC59148zba KWHzl = new InterfaceC59148zba() { // from class: o.zba.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void copydefault(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC59148zba
        public void AEQbTJ(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                copydefault(2);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC59148zba
        public void KWHzl(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull java.util.List<java.lang.String> list) {
            if (interfaceC56658yNn == null) {
                copydefault(0);
            }
            if (list == null) {
                copydefault(1);
            }
        }
    };

    void AEQbTJ(@NotNull CallableMemberDescriptor callableMemberDescriptor);

    void KWHzl(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull java.util.List<java.lang.String> list);
}
