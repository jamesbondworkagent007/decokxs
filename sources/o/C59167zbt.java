package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zbt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59167zbt {

    /* JADX INFO: renamed from: o.zbt$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ProtoBuf.MemberKind.values().length];
            try {
                iArr[ProtoBuf.MemberKind.DECLARATION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.MemberKind.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.MemberKind.DELEGATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.MemberKind.SYNTHESIZED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[CallableMemberDescriptor.Kind.values().length];
            try {
                iArr2[CallableMemberDescriptor.Kind.DECLARATION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.DELEGATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.SYNTHESIZED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            EZpvd = iArr2;
            int[] iArr3 = new int[ProtoBuf.Visibility.values().length];
            try {
                iArr3[ProtoBuf.Visibility.INTERNAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PRIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PROTECTED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PUBLIC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[ProtoBuf.Visibility.LOCAL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            copydefault = iArr3;
        }
    }

    public static final CallableMemberDescriptor.Kind EZpvd(@NotNull C59168zbu c59168zbu, ProtoBuf.MemberKind memberKind) {
        Intrinsics.checkNotNullParameter(c59168zbu, "");
        int i = memberKind == null ? -1 : Application.AEQbTJ[memberKind.ordinal()];
        if (i == 1) {
            return CallableMemberDescriptor.Kind.DECLARATION;
        }
        if (i == 2) {
            return CallableMemberDescriptor.Kind.FAKE_OVERRIDE;
        }
        if (i == 3) {
            return CallableMemberDescriptor.Kind.DELEGATION;
        }
        if (i == 4) {
            return CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return CallableMemberDescriptor.Kind.DECLARATION;
    }

    public static final yNC AEQbTJ(@NotNull C59168zbu c59168zbu, ProtoBuf.Visibility visibility) {
        Intrinsics.checkNotNullParameter(c59168zbu, "");
        switch (visibility == null ? -1 : Application.copydefault[visibility.ordinal()]) {
            case 1:
                yNC ync = C56669yNy.KWHzl;
                Intrinsics.checkNotNullExpressionValue(ync, "");
                return ync;
            case 2:
                yNC ync2 = C56669yNy.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(ync2, "");
                return ync2;
            case 3:
                yNC ync3 = C56669yNy.values;
                Intrinsics.checkNotNullExpressionValue(ync3, "");
                return ync3;
            case 4:
                yNC ync4 = C56669yNy.isConnected;
                Intrinsics.checkNotNullExpressionValue(ync4, "");
                return ync4;
            case 5:
                yNC ync5 = C56669yNy.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(ync5, "");
                return ync5;
            case 6:
                yNC ync6 = C56669yNy.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(ync6, "");
                return ync6;
            default:
                yNC ync7 = C56669yNy.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(ync7, "");
                return ync7;
        }
    }
}
