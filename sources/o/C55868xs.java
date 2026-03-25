package o;

import aws.smithy.kotlin.runtime.auth.awssigning.AwsSignatureType;
import aws.smithy.kotlin.runtime.auth.awssigning.DefaultSignatureCalculator$1;
import aws.smithy.kotlin.runtime.time.TimestampFormat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC55709xp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C55868xs implements InterfaceC55921xt {
    public final Function0<InterfaceC59908zr> KWHzl;

    /* JADX INFO: renamed from: o.xs$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AwsSignatureType.values().length];
            try {
                iArr[AwsSignatureType.HTTP_REQUEST_EVENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55868xs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zr> */
    /* JADX WARN: Multi-variable type inference failed */
    public C55868xs(@NotNull Function0<? extends InterfaceC59908zr> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function0:0x0004: SGET  A[WRAPPED] (LINE:66) aws.smithy.kotlin.runtime.auth.awssigning.DefaultSignatureCalculator$1.INSTANCE aws.smithy.kotlin.runtime.auth.awssigning.DefaultSignatureCalculator$1) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<? extends o.zr>):void (m)] (LINE:66) call: o.xs.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C55868xs(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DefaultSignatureCalculator$1.INSTANCE : function0);
    }

    @Override // o.InterfaceC55921xt
    public java.lang.String EZpvd(@NotNull byte[] bArr, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C5165Hf.AEQbTJ(C59907zq.EZpvd(bArr, C59449zhJ.getNewProxyInstance(str), this.KWHzl));
    }

    @Override // o.InterfaceC55921xt
    public java.lang.String OLrzqt(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull C55338xi c55338xi) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(c55338xi, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AWS4-HMAC-SHA256-PAYLOAD");
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(c55338xi.isConnected().OLrzqt(TimestampFormat.ISO_8601_CONDENSED));
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(C55815xr.OLrzqt(c55338xi));
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(C59449zhJ.copydefault(bArr2));
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        if (StateListAnimator.EZpvd[c55338xi.DbNXlk().ordinal()] == 1) {
            strKWHzl = C55974xu.copydefault(c55338xi.isConnected());
        } else {
            strKWHzl = AbstractC55709xp.Application.copydefault.KWHzl();
        }
        sb.append(strKWHzl);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(C5165Hf.AEQbTJ(C59971zt.copydefault(bArr, this.KWHzl)));
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.InterfaceC55921xt
    public java.lang.String KWHzl(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull C55338xi c55338xi) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(c55338xi, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AWS4-HMAC-SHA256-TRAILER");
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(c55338xi.isConnected().OLrzqt(TimestampFormat.ISO_8601_CONDENSED));
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(C55815xr.OLrzqt(c55338xi));
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(C59449zhJ.copydefault(bArr2));
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(C5165Hf.AEQbTJ(C59971zt.copydefault(bArr, this.KWHzl)));
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final byte[] copydefault(C55868xs c55868xs, byte[] bArr, java.lang.String str) {
        return C59907zq.EZpvd(bArr, C59449zhJ.getNewProxyInstance(str), c55868xs.KWHzl);
    }

    @Override // o.InterfaceC55921xt
    public byte[] KWHzl(@NotNull C55338xi c55338xi) {
        Intrinsics.checkNotNullParameter(c55338xi, "");
        return copydefault(this, copydefault(this, copydefault(this, copydefault(this, C59449zhJ.getNewProxyInstance("AWS4" + c55338xi.OLrzqt().copydefault()), c55338xi.isConnected().OLrzqt(TimestampFormat.ISO_8601_CONDENSED_DATE)), c55338xi.AhwBna()), c55338xi.djBIcL()), "aws4_request");
    }

    @Override // o.InterfaceC55921xt
    public java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull C55338xi c55338xi) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c55338xi, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AWS4-HMAC-SHA256");
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(c55338xi.isConnected().OLrzqt(TimestampFormat.ISO_8601_CONDENSED));
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(C55815xr.OLrzqt(c55338xi));
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(C5165Hf.AEQbTJ(C59971zt.copydefault(C59449zhJ.getNewProxyInstance(str), this.KWHzl)));
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
