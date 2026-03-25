package o;

import com.bytedance.applog.IAppLogInstance;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.okuser.data.User;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32910mmW {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC47278tmy KWHzl;
    public final java.util.Map<AmplitudeName, java.lang.Boolean> OLrzqt;

    /* JADX INFO: renamed from: o.mmW$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AmplitudeName.values().length];
            try {
                iArr[AmplitudeName.CEFI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AmplitudeName.WEB3.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public C32910mmW(@NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull InterfaceC56387yDm<pUV> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        this.KWHzl = interfaceC47278tmy;
        this.OLrzqt = new LinkedHashMap();
        this.AEQbTJ = interfaceC56387yDm;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r1v0 o.tmy)
  (wrap:o.yDm:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yDm:0x0009: INVOKE 
  (wrap:kotlin.jvm.functions.Function0:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:17) call: o.mnf.<init>():void type: CONSTRUCTOR)
 STATIC call: o.yDr.copydefault(kotlin.jvm.functions.Function0):o.yDm A[MD:<T>:(kotlin.jvm.functions.Function0<? extends T>):o.yDm<T> (m), WRAPPED] (LINE:17)) : (r2v0 o.yDm))
 A[MD:(o.tmy, o.yDm<o.pUV>):void (m)] (LINE:15) call: o.mmW.<init>(o.tmy, o.yDm):void type: THIS */
    public /* synthetic */ C32910mmW(InterfaceC47278tmy interfaceC47278tmy, InterfaceC56387yDm interfaceC56387yDm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC47278tmy, (i & 2) != 0 ? C56392yDr.copydefault(new Function0() { // from class: o.mnf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32910mmW.AEQbTJ();
            }
        }) : interfaceC56387yDm);
    }

    public static final pUV AEQbTJ() {
        return new pUV("TrackVerify", false, false, false, 14, null);
    }

    public final pUV EZpvd() {
        return (pUV) this.AEQbTJ.getValue();
    }

    public final void OLrzqt(AmplitudeName amplitudeName, IAppLogInstance iAppLogInstance, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Boolean bool = this.OLrzqt.get(amplitudeName);
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(bool, bool2)) {
            return;
        }
        this.OLrzqt.put(amplitudeName, bool2);
        if (amplitudeName == null || iAppLogInstance == null) {
            EZpvd().AEQbTJ("ByteDance instance: null, event:" + str + ", verify failed.");
            return;
        }
        int i = Activity.EZpvd[amplitudeName.ordinal()];
        if (i == 1) {
            AEQbTJ(iAppLogInstance, str);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            KWHzl(iAppLogInstance, str);
        }
    }

    public final void KWHzl(IAppLogInstance iAppLogInstance, java.lang.String str) {
        java.lang.String strCopydefault = xVW.copydefault();
        java.lang.String userUniqueID = iAppLogInstance.getUserUniqueID();
        Intrinsics.checkNotNullExpressionValue(userUniqueID, "");
        java.lang.String userUniqueID2 = iAppLogInstance.getUserUniqueID();
        Intrinsics.checkNotNullExpressionValue(userUniqueID2, "");
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) userUniqueID) && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) userUniqueID2)) {
            EZpvd().copydefault("ByteDance instance: " + AmplitudeName.WEB3 + ", event:" + str + ", verify pass");
            return;
        }
        EZpvd().AEQbTJ("ByteDance instance: " + AmplitudeName.WEB3 + ", event:" + str + ", verify failed. okxDid:" + strCopydefault + ", ampDid:" + userUniqueID);
    }

    public final void AEQbTJ(IAppLogInstance iAppLogInstance, java.lang.String str) {
        User userOLrzqt = this.KWHzl.OLrzqt();
        java.lang.String tk = userOLrzqt != null ? userOLrzqt.getTk() : null;
        if (tk == null) {
            tk = "";
        }
        java.lang.String userUniqueID = iAppLogInstance.getUserUniqueID();
        Intrinsics.checkNotNullExpressionValue(userUniqueID, "");
        if (Intrinsics.EZpvd((java.lang.Object) tk, (java.lang.Object) userUniqueID)) {
            EZpvd().copydefault("ByteDance instance: " + AmplitudeName.CEFI + ", event:" + str + ", verify pass");
            return;
        }
        EZpvd().AEQbTJ("ByteDance instance: " + AmplitudeName.CEFI + ", event:" + str + ", verify failed");
    }

    /* JADX INFO: renamed from: o.mmW$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mmW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
