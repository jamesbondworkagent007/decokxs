package o;

import android.view.View;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.oklive.app.OKLiveServiceImpl$navigateToLiveStreamPage$1;
import com.okinc.oklive.app.OKLiveServiceImpl$setupLoginListener$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.sWj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sTp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44537sTp extends AbstractC43215rlA implements InterfaceC44531sTi {
    public final C44535sTn KWHzl;
    public final CoroutineScope copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    public C44537sTp(@NotNull C44535sTn c44535sTn) {
        Intrinsics.checkNotNullParameter(c44535sTn, "");
        this.KWHzl = c44535sTn;
        this.copydefault = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain()));
        AEQbTJ();
    }

    /* JADX INFO: renamed from: o.sTp$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sTp.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(this.copydefault, Dispatchers.getIO(), null, new OKLiveServiceImpl$setupLoginListener$1(this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44531sTi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.Integer num, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKLiveServiceImpl$navigateToLiveStreamPage$1 oKLiveServiceImpl$navigateToLiveStreamPage$1;
        android.content.Context context2;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map2;
        java.lang.Integer num2;
        boolean z;
        InterfaceC44559sUk interfaceC44559sUk;
        if (continuation instanceof OKLiveServiceImpl$navigateToLiveStreamPage$1) {
            oKLiveServiceImpl$navigateToLiveStreamPage$1 = (OKLiveServiceImpl$navigateToLiveStreamPage$1) continuation;
            int i = oKLiveServiceImpl$navigateToLiveStreamPage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKLiveServiceImpl$navigateToLiveStreamPage$1.label = i - Integer.MIN_VALUE;
            } else {
                oKLiveServiceImpl$navigateToLiveStreamPage$1 = new OKLiveServiceImpl$navigateToLiveStreamPage$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = oKLiveServiceImpl$navigateToLiveStreamPage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKLiveServiceImpl$navigateToLiveStreamPage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pUU.EZpvd("OKLiveServiceImpl", "navigateToLiveStreamPage");
            C44543sTv c44543sTv = C44543sTv.copydefault;
            if (c44543sTv.EZpvd()) {
                pUU.copydefault("OKLiveServiceImpl", "live streaming feature is restricted");
                c44543sTv.AEQbTJ(context);
                return Unit.INSTANCE;
            }
            C44538sTq c44538sTq = C44538sTq.copydefault;
            oKLiveServiceImpl$navigateToLiveStreamPage$1.L$0 = context;
            oKLiveServiceImpl$navigateToLiveStreamPage$1.L$1 = str;
            oKLiveServiceImpl$navigateToLiveStreamPage$1.L$2 = str2;
            oKLiveServiceImpl$navigateToLiveStreamPage$1.L$3 = str3;
            oKLiveServiceImpl$navigateToLiveStreamPage$1.L$4 = map;
            oKLiveServiceImpl$navigateToLiveStreamPage$1.L$5 = num;
            oKLiveServiceImpl$navigateToLiveStreamPage$1.label = 1;
            objEZpvd = c44538sTq.EZpvd(context, oKLiveServiceImpl$navigateToLiveStreamPage$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = oKLiveServiceImpl$navigateToLiveStreamPage$1.Z$0;
                java.lang.Integer num3 = (java.lang.Integer) oKLiveServiceImpl$navigateToLiveStreamPage$1.L$5;
                java.util.Map<java.lang.String, ? extends java.lang.Object> map3 = (java.util.Map) oKLiveServiceImpl$navigateToLiveStreamPage$1.L$4;
                java.lang.String str7 = (java.lang.String) oKLiveServiceImpl$navigateToLiveStreamPage$1.L$3;
                java.lang.String str8 = (java.lang.String) oKLiveServiceImpl$navigateToLiveStreamPage$1.L$2;
                java.lang.String str9 = (java.lang.String) oKLiveServiceImpl$navigateToLiveStreamPage$1.L$1;
                android.content.Context context3 = (android.content.Context) oKLiveServiceImpl$navigateToLiveStreamPage$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                num2 = num3;
                map2 = map3;
                str6 = str7;
                str5 = str8;
                str4 = str9;
                context2 = context3;
                boolean zBooleanValue = ((java.lang.Boolean) objEZpvd).booleanValue();
                if (z && zBooleanValue && (interfaceC44559sUk = (InterfaceC44559sUk) C43251rlk.OLrzqt(InterfaceC44559sUk.class)) != null) {
                    interfaceC44559sUk.KWHzl(context2, str4, str5, str6, map2, num2);
                }
                return Unit.INSTANCE;
            }
            num = (java.lang.Integer) oKLiveServiceImpl$navigateToLiveStreamPage$1.L$5;
            map = (java.util.Map) oKLiveServiceImpl$navigateToLiveStreamPage$1.L$4;
            str3 = (java.lang.String) oKLiveServiceImpl$navigateToLiveStreamPage$1.L$3;
            str2 = (java.lang.String) oKLiveServiceImpl$navigateToLiveStreamPage$1.L$2;
            str = (java.lang.String) oKLiveServiceImpl$navigateToLiveStreamPage$1.L$1;
            context = (android.content.Context) oKLiveServiceImpl$navigateToLiveStreamPage$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        boolean zBooleanValue2 = ((java.lang.Boolean) objEZpvd).booleanValue();
        C44538sTq c44538sTq2 = C44538sTq.copydefault;
        oKLiveServiceImpl$navigateToLiveStreamPage$1.L$0 = context;
        oKLiveServiceImpl$navigateToLiveStreamPage$1.L$1 = str;
        oKLiveServiceImpl$navigateToLiveStreamPage$1.L$2 = str2;
        oKLiveServiceImpl$navigateToLiveStreamPage$1.L$3 = str3;
        oKLiveServiceImpl$navigateToLiveStreamPage$1.L$4 = map;
        oKLiveServiceImpl$navigateToLiveStreamPage$1.L$5 = num;
        oKLiveServiceImpl$navigateToLiveStreamPage$1.Z$0 = zBooleanValue2;
        oKLiveServiceImpl$navigateToLiveStreamPage$1.label = 2;
        java.lang.Object objKWHzl = c44538sTq2.KWHzl(context, oKLiveServiceImpl$navigateToLiveStreamPage$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        context2 = context;
        str4 = str;
        str5 = str2;
        str6 = str3;
        map2 = map;
        num2 = num;
        z = zBooleanValue2;
        objEZpvd = objKWHzl;
        boolean zBooleanValue3 = ((java.lang.Boolean) objEZpvd).booleanValue();
        if (z) {
            interfaceC44559sUk.KWHzl(context2, str4, str5, str6, map2, num2);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC44531sTi
    public AbstractC32996moC EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, InterfaceC44530sTh interfaceC44530sTh) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C44573sUy c44573sUyKWHzl = C44573sUy.Companion.KWHzl(str, str2);
        c44573sUyKWHzl.EZpvd(interfaceC44530sTh);
        return c44573sUyKWHzl;
    }

    @Override // o.InterfaceC44531sTi
    public java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class);
        if (oKComplianceRestrictionService == null || oKComplianceRestrictionService.AEQbTJ(OKComplianceRestrictionService.Feature.LIVE_STREAMING)) {
            pUU.copydefault("OKLiveService", "live streaming feature is restricted");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(sWj.Activity.AuCTel);
            viewOnClickListenerC54939xaY.copydefault(sWj.Activity.fetchVPNInfo);
            viewOnClickListenerC54939xaY.EZpvd(sWj.Activity.copydefault, new View.OnClickListener() { // from class: o.sTm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C44537sTp.OLrzqt(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
            return Unit.INSTANCE;
        }
        java.lang.Object objAEQbTJ = new sUW(((sTM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), sTM.class)).RTWSvT()).AEQbTJ(context, str, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
