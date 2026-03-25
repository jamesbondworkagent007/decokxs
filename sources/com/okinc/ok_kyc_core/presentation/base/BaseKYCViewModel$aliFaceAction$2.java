package com.okinc.ok_kyc_core.presentation.base;

import androidx.fragment.app.FragmentActivity;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42074rFj;
import o.C42467rTy;
import o.C43251rlk;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC42440rSy;
import o.pHD;

/* JADX INFO: loaded from: classes23.dex */
public final class BaseKYCViewModel$aliFaceAction$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ CTAButtonAppModel $ctaModel;
    final /* synthetic */ Map<String, String> $ctaValue;
    final /* synthetic */ String $featureUri;
    final /* synthetic */ String $id;
    final /* synthetic */ HashMap<String, String> $params;
    final /* synthetic */ String $playbook;
    final /* synthetic */ String $target;
    final /* synthetic */ ComplianceTheme $theme;
    final /* synthetic */ C52794wYp $view;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ AbstractC42074rFj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseKYCViewModel$aliFaceAction$2(FragmentActivity fragmentActivity, String str, HashMap<String, String> map, AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, CTAButtonAppModel cTAButtonAppModel, ComplianceTheme complianceTheme, String str2, String str3, Map<String, String> map2, String str4, Continuation<? super BaseKYCViewModel$aliFaceAction$2> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$playbook = str;
        this.$params = map;
        this.this$0 = abstractC42074rFj;
        this.$view = c52794wYp;
        this.$ctaModel = cTAButtonAppModel;
        this.$theme = complianceTheme;
        this.$target = str2;
        this.$id = str3;
        this.$ctaValue = map2;
        this.$featureUri = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKYCViewModel$aliFaceAction$2(this.$activity, this.$playbook, this.$params, this.this$0, this.$view, this.$ctaModel, this.$theme, this.$target, this.$id, this.$ctaValue, this.$featureUri, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKYCViewModel$aliFaceAction$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FragmentActivity fragmentActivity;
        AbstractC42074rFj abstractC42074rFj;
        Object objAEQbTJ;
        String str;
        String str2;
        ComplianceTheme complianceTheme;
        CTAButtonAppModel cTAButtonAppModel;
        Map<String, String> map;
        String str3;
        HashMap<String, String> map2;
        FragmentActivity fragmentActivity2;
        C52794wYp c52794wYp;
        String str4;
        InterfaceC42440rSy interfaceC42440rSy;
        StateListAnimator stateListAnimator;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            fragmentActivity = this.$activity;
            if (fragmentActivity != null) {
                String str5 = this.$playbook;
                HashMap<String, String> map3 = this.$params;
                abstractC42074rFj = this.this$0;
                C52794wYp c52794wYp2 = this.$view;
                CTAButtonAppModel cTAButtonAppModel2 = this.$ctaModel;
                ComplianceTheme complianceTheme2 = this.$theme;
                String str6 = this.$target;
                String str7 = this.$id;
                Map<String, String> map4 = this.$ctaValue;
                String str8 = this.$featureUri;
                C42467rTy c42467rTy = C42467rTy.KWHzl;
                this.L$0 = str5;
                this.L$1 = map3;
                this.L$2 = abstractC42074rFj;
                this.L$3 = c52794wYp2;
                this.L$4 = fragmentActivity;
                this.L$5 = cTAButtonAppModel2;
                this.L$6 = complianceTheme2;
                this.L$7 = str6;
                this.L$8 = str7;
                this.L$9 = map4;
                this.L$10 = str8;
                this.L$11 = fragmentActivity;
                this.label = 1;
                objAEQbTJ = c42467rTy.AEQbTJ(fragmentActivity, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                str = str7;
                str2 = str6;
                complianceTheme = complianceTheme2;
                cTAButtonAppModel = cTAButtonAppModel2;
                map = map4;
                str3 = str8;
                map2 = map3;
                fragmentActivity2 = fragmentActivity;
                c52794wYp = c52794wYp2;
                str4 = str5;
                if (((Boolean) objAEQbTJ).booleanValue()) {
                    stateListAnimator = new StateListAnimator(abstractC42074rFj, c52794wYp, fragmentActivity2, cTAButtonAppModel, complianceTheme, str2, str, map, str4, str3, map2);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.L$10 = null;
                    this.L$11 = null;
                    this.label = 2;
                    if (interfaceC42440rSy.copydefault(fragmentActivity, stateListAnimator, str4, map2, this) == objCopydefault) {
                    }
                }
            }
        } else if (i == 1) {
            FragmentActivity fragmentActivity3 = (FragmentActivity) this.L$11;
            String str9 = (String) this.L$10;
            Map<String, String> map5 = (Map) this.L$9;
            String str10 = (String) this.L$8;
            String str11 = (String) this.L$7;
            ComplianceTheme complianceTheme3 = (ComplianceTheme) this.L$6;
            CTAButtonAppModel cTAButtonAppModel3 = (CTAButtonAppModel) this.L$5;
            FragmentActivity fragmentActivity4 = (FragmentActivity) this.L$4;
            C52794wYp c52794wYp3 = (C52794wYp) this.L$3;
            abstractC42074rFj = (AbstractC42074rFj) this.L$2;
            HashMap<String, String> map6 = (HashMap) this.L$1;
            String str12 = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            str3 = str9;
            map = map5;
            str = str10;
            str2 = str11;
            complianceTheme = complianceTheme3;
            cTAButtonAppModel = cTAButtonAppModel3;
            map2 = map6;
            str4 = str12;
            objAEQbTJ = obj;
            fragmentActivity2 = fragmentActivity4;
            c52794wYp = c52794wYp3;
            fragmentActivity = fragmentActivity3;
            if (((Boolean) objAEQbTJ).booleanValue() && (interfaceC42440rSy = (InterfaceC42440rSy) C43251rlk.OLrzqt(InterfaceC42440rSy.class)) != null) {
                stateListAnimator = new StateListAnimator(abstractC42074rFj, c52794wYp, fragmentActivity2, cTAButtonAppModel, complianceTheme, str2, str, map, str4, str3, map2);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = null;
                this.label = 2;
                if (interfaceC42440rSy.copydefault(fragmentActivity, stateListAnimator, str4, map2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements pHD {
        public final /* synthetic */ CTAButtonAppModel AEQbTJ;
        public final /* synthetic */ String AYXKKw;
        public final /* synthetic */ HashMap<String, String> AhwBna;
        public final /* synthetic */ FragmentActivity EZpvd;
        public final /* synthetic */ String KWHzl;
        public final /* synthetic */ String OLrzqt;
        public final /* synthetic */ Map<String, String> copydefault;
        public final /* synthetic */ ComplianceTheme djBIcL;
        public final /* synthetic */ C52794wYp gEmmrt;
        public final /* synthetic */ AbstractC42074rFj isConnected;
        public final /* synthetic */ String valueOf;

        public StateListAnimator(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, FragmentActivity fragmentActivity, CTAButtonAppModel cTAButtonAppModel, ComplianceTheme complianceTheme, String str, String str2, Map<String, String> map, String str3, String str4, HashMap<String, String> map2) {
            this.isConnected = abstractC42074rFj;
            this.gEmmrt = c52794wYp;
            this.EZpvd = fragmentActivity;
            this.AEQbTJ = cTAButtonAppModel;
            this.djBIcL = complianceTheme;
            this.AYXKKw = str;
            this.KWHzl = str2;
            this.copydefault = map;
            this.valueOf = str3;
            this.OLrzqt = str4;
            this.AhwBna = map2;
        }
    }
}
