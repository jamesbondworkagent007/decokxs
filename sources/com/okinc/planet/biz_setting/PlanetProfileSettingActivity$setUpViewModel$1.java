package com.okinc.planet.biz_setting;

import com.okinc.account.api.model.usercenter.EditProfileScenario;
import com.okinc.account.api.service.UserInfoService;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_onboarding.OrbitEditProfileScenario;
import com.okinc.planet.biz_setting.PlanetProfileSettingActivity$setUpViewModel$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.ActivityC46100tHv;
import o.ActivityC46114tIi;
import o.C32866mlf;
import o.C43251rlk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.tHW;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetProfileSettingActivity$setUpViewModel$1 extends SuspendLambda implements Function2<tHW.ActionBar, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC46100tHv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetProfileSettingActivity$setUpViewModel$1(ActivityC46100tHv activityC46100tHv, Continuation<? super PlanetProfileSettingActivity$setUpViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC46100tHv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetProfileSettingActivity$setUpViewModel$1 planetProfileSettingActivity$setUpViewModel$1 = new PlanetProfileSettingActivity$setUpViewModel$1(this.this$0, continuation);
        planetProfileSettingActivity$setUpViewModel$1.L$0 = obj;
        return planetProfileSettingActivity$setUpViewModel$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tHW.ActionBar actionBar, Continuation<? super Unit> continuation) {
        return ((PlanetProfileSettingActivity$setUpViewModel$1) create(actionBar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            tHW.ActionBar actionBar = (tHW.ActionBar) this.L$0;
            if (actionBar instanceof tHW.ActionBar.StateListAnimator) {
                C55326xho.toastWithFailedIcon$default(((tHW.ActionBar.StateListAnimator) actionBar).AEQbTJ(), 0, 1, (Object) null);
            } else if (actionBar instanceof tHW.ActionBar.Application) {
                this.this$0.startActivity(ActivityC46114tIi.Companion.EZpvd(this.this$0, ((tHW.ActionBar.Application) actionBar).AEQbTJ()));
            } else if (actionBar instanceof tHW.ActionBar.Activity) {
                OrbitEditProfileScenario.OrbitSetting orbitSetting = new OrbitEditProfileScenario.OrbitSetting(true);
                UserInfoService userInfoService = (UserInfoService) C43251rlk.copydefault(UserInfoService.class);
                EditProfileScenario editProfileScenarioAEQbTJ = orbitSetting.AEQbTJ();
                String strCopydefault = orbitSetting.copydefault();
                String strKWHzl = orbitSetting.KWHzl();
                String strOLrzqt = orbitSetting.OLrzqt();
                final ActivityC46100tHv activityC46100tHv = this.this$0;
                UserInfoService.Application.startEditProfileFlow$default(userInfoService, this.this$0, editProfileScenarioAEQbTJ, new UserInfoService.ActionBar() { // from class: com.okinc.planet.biz_setting.PlanetProfileSettingActivity$setUpViewModel$1.1
                }, null, strCopydefault, strKWHzl, strOLrzqt, 8, null);
                C32866mlf.onEvent$default("community_setting_persona_click", (TrackChannel[]) null, new Function1() { // from class: o.tHT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return PlanetProfileSettingActivity$setUpViewModel$1.invokeSuspend$lambda$0((EventParamsList) obj2);
                    }
                }, 1, (Object) null);
            } else if (actionBar instanceof tHW.ActionBar.C0957ActionBar) {
                OrbitEditProfileScenario.OrbitSetting orbitSetting2 = new OrbitEditProfileScenario.OrbitSetting(true);
                UserInfoService userInfoService2 = (UserInfoService) C43251rlk.copydefault(UserInfoService.class);
                EditProfileScenario editProfileScenarioAEQbTJ2 = orbitSetting2.AEQbTJ();
                String strCopydefault2 = orbitSetting2.copydefault();
                String strKWHzl2 = orbitSetting2.KWHzl();
                String strOLrzqt2 = orbitSetting2.OLrzqt();
                final ActivityC46100tHv activityC46100tHv2 = this.this$0;
                UserInfoService.Application.startEditProfileFlow$default(userInfoService2, this.this$0, editProfileScenarioAEQbTJ2, new UserInfoService.ActionBar() { // from class: com.okinc.planet.biz_setting.PlanetProfileSettingActivity$setUpViewModel$1.4
                }, null, strCopydefault2, strKWHzl2, strOLrzqt2, 8, null);
            } else if (actionBar instanceof tHW.ActionBar.TaskDescription) {
                OrbitEditProfileScenario.OrbitSetting orbitSetting3 = new OrbitEditProfileScenario.OrbitSetting(true);
                UserInfoService userInfoService3 = (UserInfoService) C43251rlk.copydefault(UserInfoService.class);
                EditProfileScenario editProfileScenarioAEQbTJ3 = orbitSetting3.AEQbTJ();
                String strCopydefault3 = orbitSetting3.copydefault();
                String strKWHzl3 = orbitSetting3.KWHzl();
                String strOLrzqt3 = orbitSetting3.OLrzqt();
                final ActivityC46100tHv activityC46100tHv3 = this.this$0;
                UserInfoService.Application.startEditProfileFlow$default(userInfoService3, this.this$0, editProfileScenarioAEQbTJ3, new UserInfoService.ActionBar() { // from class: com.okinc.planet.biz_setting.PlanetProfileSettingActivity$setUpViewModel$1.3
                }, null, strCopydefault3, strKWHzl3, strOLrzqt3, 8, null);
            } else if (actionBar instanceof tHW.ActionBar.FragmentManager) {
                this.this$0.EZpvd(((tHW.ActionBar.FragmentManager) actionBar).EZpvd());
            } else if (actionBar instanceof tHW.ActionBar.LoaderManager) {
                this.this$0.EZpvd(((tHW.ActionBar.LoaderManager) actionBar).EZpvd());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(EventParamsList eventParamsList) {
        eventParamsList.put("action_type", "Click", true);
        return Unit.INSTANCE;
    }
}
