package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zbC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59124zbC extends AbstractC59086zaR implements InterfaceC56634yMq {
    public static final TaskDescription AkhnZx = new TaskDescription(null);
    public final boolean fetchVPNInfo;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 o.yXs)
  (r2v0 o.zcM)
  (r3v0 o.yNP)
  (r4v0 kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment)
  (r5v0 o.yWN)
  (r6v0 boolean)
 A[MD:(o.yXs, o.zcM, o.yNP, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment, o.yWN, boolean):void (m)] call: o.zbC.<init>(o.yXs, o.zcM, o.yNP, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment, o.yWN, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C59124zbC(C56933yXs c56933yXs, InterfaceC59187zcM interfaceC59187zcM, yNP ynp, ProtoBuf.PackageFragment packageFragment, yWN ywn, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(c56933yXs, interfaceC59187zcM, ynp, packageFragment, ywn, z);
    }

    public C59124zbC(C56933yXs c56933yXs, InterfaceC59187zcM interfaceC59187zcM, yNP ynp, ProtoBuf.PackageFragment packageFragment, yWN ywn, boolean z) {
        super(c56933yXs, interfaceC59187zcM, ynp, packageFragment, ywn, null);
        this.fetchVPNInfo = z;
    }

    /* JADX INFO: renamed from: o.zbC$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zbC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C59124zbC EZpvd(@NotNull C56933yXs c56933yXs, @NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull yNP ynp, @NotNull java.io.InputStream inputStream, boolean z) {
            Intrinsics.checkNotNullParameter(c56933yXs, "");
            Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
            Intrinsics.checkNotNullParameter(ynp, "");
            Intrinsics.checkNotNullParameter(inputStream, "");
            kotlin.Pair<ProtoBuf.PackageFragment, yWN> pairCopydefault = yWR.copydefault(inputStream);
            ProtoBuf.PackageFragment packageFragmentComponent1 = pairCopydefault.component1();
            yWN ywnComponent2 = pairCopydefault.component2();
            if (packageFragmentComponent1 == null) {
                throw new java.lang.UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + yWN.EZpvd + ", actual " + ywnComponent2 + ". Please update Kotlin");
            }
            return new C59124zbC(c56933yXs, interfaceC59187zcM, ynp, packageFragmentComponent1, ywnComponent2, z, null);
        }
    }

    @Override // o.yPE, o.AbstractC56711yPm
    public java.lang.String toString() {
        return "builtins package fragment for " + KWHzl() + " from " + yZE.AhwBna(this);
    }
}
