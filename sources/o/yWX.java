package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yWX {
    public final java.util.List<ProtoBuf.VersionRequirement> copydefault;
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public static final yWX AEQbTJ = new yWX(yDY.AhwBna());

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.util.List) A[MD:(java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement>):void (m)] call: o.yWX.<init>(java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ yWX(java.util.List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    public yWX(java.util.List<ProtoBuf.VersionRequirement> list) {
        this.copydefault = list;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yWX.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final yWX KWHzl() {
            return yWX.AEQbTJ;
        }

        public final yWX EZpvd(@NotNull ProtoBuf.VersionRequirementTable versionRequirementTable) {
            Intrinsics.checkNotNullParameter(versionRequirementTable, "");
            if (versionRequirementTable.getRequirementCount() == 0) {
                return KWHzl();
            }
            java.util.List<ProtoBuf.VersionRequirement> requirementList = versionRequirementTable.getRequirementList();
            Intrinsics.checkNotNullExpressionValue(requirementList, "");
            return new yWX(requirementList, null);
        }
    }
}
