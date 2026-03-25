package com.okinc.planet.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.planet.domain.data.OrbitSimpleInfo;
import com.okinc.planet.manager.OrbitStatus;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C46447tUr;
import o.C56391yDq;
import o.C56442yFn;
import o.tJI;
import o.tKI;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetNavigationUtil$showUserCenterPage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ ActivityResultLauncher<Intent> $activityResultLauncher;
    final /* synthetic */ String $authorId;
    final /* synthetic */ String $channel;
    final /* synthetic */ Context $context;
    final /* synthetic */ Map<String, Object> $feedLuaExtraParams;
    final /* synthetic */ String $leadTab;
    final /* synthetic */ String $location;
    final /* synthetic */ String $socialSettingsActions;
    final /* synthetic */ String $timeSpan;
    final /* synthetic */ String $tradeType;
    final /* synthetic */ String $uid;
    final /* synthetic */ String $uniqueName;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetNavigationUtil$showUserCenterPage$2(Activity activity, String str, String str2, String str3, Context context, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, ? extends Object> map, ActivityResultLauncher<Intent> activityResultLauncher, Continuation<? super PlanetNavigationUtil$showUserCenterPage$2> continuation) {
        super(2, continuation);
        this.$activity = activity;
        this.$uid = str;
        this.$uniqueName = str2;
        this.$authorId = str3;
        this.$context = context;
        this.$channel = str4;
        this.$location = str5;
        this.$leadTab = str6;
        this.$tradeType = str7;
        this.$socialSettingsActions = str8;
        this.$timeSpan = str9;
        this.$feedLuaExtraParams = map;
        this.$activityResultLauncher = activityResultLauncher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetNavigationUtil$showUserCenterPage$2 planetNavigationUtil$showUserCenterPage$2 = new PlanetNavigationUtil$showUserCenterPage$2(this.$activity, this.$uid, this.$uniqueName, this.$authorId, this.$context, this.$channel, this.$location, this.$leadTab, this.$tradeType, this.$socialSettingsActions, this.$timeSpan, this.$feedLuaExtraParams, this.$activityResultLauncher, continuation);
        planetNavigationUtil$showUserCenterPage$2.L$0 = obj;
        return planetNavigationUtil$showUserCenterPage$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetNavigationUtil$showUserCenterPage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Activity activity = this.$activity;
            if (activity instanceof AbstractActivityC33041mov) {
                ((AbstractActivityC33041mov) activity).showLoading();
            }
            C46447tUr c46447tUr = C46447tUr.KWHzl;
            String str = this.$uid;
            String str2 = this.$uniqueName;
            String str3 = this.$authorId;
            this.L$0 = coroutineScope;
            this.label = 1;
            objAEQbTJ = c46447tUr.AEQbTJ(str, "", str2, str3, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        OrbitSimpleInfo orbitSimpleInfo = (OrbitSimpleInfo) objAEQbTJ;
        Activity activity2 = this.$activity;
        if (activity2 instanceof AbstractActivityC33041mov) {
            ((AbstractActivityC33041mov) activity2).dismissLoading();
        }
        if (orbitSimpleInfo != null) {
            Context context = this.$context;
            String str4 = this.$uid;
            String str5 = this.$authorId;
            String str6 = this.$uniqueName;
            String str7 = this.$channel;
            String str8 = this.$location;
            String str9 = this.$leadTab;
            String str10 = this.$tradeType;
            String str11 = this.$socialSettingsActions;
            String str12 = this.$timeSpan;
            Map<String, Object> map = this.$feedLuaExtraParams;
            ActivityResultLauncher<Intent> activityResultLauncher = this.$activityResultLauncher;
            Activity activity3 = this.$activity;
            if (OrbitStatus.Companion.AEQbTJ(orbitSimpleInfo.getOrbitLevel()).isOrbiter() || !Intrinsics.EZpvd((Object) orbitSimpleInfo.getUserType(), (Object) "1")) {
                Intent intentCopydefault = tJI.Companion.copydefault(context, str4, str5, str6, str7, (2048 & 32) != 0 ? null : str8, (2048 & 64) != 0 ? null : str9, (2048 & 128) != 0 ? null : str10 != null ? str10 : null, (2048 & 256) != 0 ? null : str11, (2048 & 512) != 0 ? null : str12, (2048 & 1024) != 0 ? null : map, (2048 & 2048) != 0 ? null : null);
                if (activityResultLauncher != null) {
                    activityResultLauncher.launch(intentCopydefault);
                } else {
                    intentCopydefault.addFlags(268435456);
                    context.startActivity(intentCopydefault);
                }
            } else {
                tKI.StateListAnimator stateListAnimator = tKI.Companion;
                FragmentManager supportFragmentManager = ((FragmentActivity) activity3).getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                stateListAnimator.OLrzqt(supportFragmentManager, orbitSimpleInfo.getAvatar(), orbitSimpleInfo.getPetname(), orbitSimpleInfo.getJoinTime());
            }
        }
        return Unit.INSTANCE;
    }
}
