package com.okinc.tradingbot.impl.market_place.my_bot;

import android.os.Bundle;
import com.appsflyer.AppsFlyerProperties;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.tradingbot.impl.market_place.my_bot.presenter.MyBotPresenter;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C51665vrM;
import o.C54589xNz;
import o.C55867xrz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;

/* JADX INFO: loaded from: classes16.dex */
public final class MyBotHostFragment$onViewCreated$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C51665vrM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyBotHostFragment$onViewCreated$2(C51665vrM c51665vrM, Continuation<? super MyBotHostFragment$onViewCreated$2> continuation) {
        super(2, continuation);
        this.this$0 = c51665vrM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MyBotHostFragment$onViewCreated$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MyBotHostFragment$onViewCreated$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            this.label = 1;
            if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, this, 3, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        C51665vrM c51665vrM = this.this$0;
        MyBotPresenter myBotPresenterAEQbTJ = C51665vrM.AEQbTJ(c51665vrM);
        Bundle arguments = c51665vrM.getArguments();
        String string = arguments != null ? arguments.getString(AppsFlyerProperties.CHANNEL) : null;
        if (string == null) {
            string = "";
        }
        myBotPresenterAEQbTJ.OLrzqt(string);
        MyBotPresenter myBotPresenterAEQbTJ2 = C51665vrM.AEQbTJ(c51665vrM);
        Bundle arguments2 = c51665vrM.getArguments();
        String string2 = arguments2 != null ? arguments2.getString("bot_total_assets") : null;
        if (string2 == null) {
            string2 = "";
        }
        myBotPresenterAEQbTJ2.AEQbTJ(string2);
        MyBotPresenter myBotPresenterAEQbTJ3 = C51665vrM.AEQbTJ(c51665vrM);
        Bundle arguments3 = c51665vrM.getArguments();
        String string3 = arguments3 != null ? arguments3.getString("location") : null;
        if (string3 == null) {
            string3 = "";
        }
        myBotPresenterAEQbTJ3.EZpvd(string3);
        C51665vrM.AEQbTJ(c51665vrM).copydefault(c51665vrM.isConnected());
        Bundle arguments4 = c51665vrM.getArguments();
        String string4 = arguments4 != null ? arguments4.getString(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER) : null;
        c51665vrM.gEmmrt = string4 != null ? string4 : "";
        c51665vrM.fetchVPNInfo();
        C55867xrz.KWHzl.EZpvd();
        if (c51665vrM.isAdded()) {
            c51665vrM.AYXKKw();
        }
        c51665vrM.copydefault(c51665vrM.gEmmrt);
        c51665vrM.values();
        if (c51665vrM.isAdded()) {
            c51665vrM.AkhnZx();
            Bundle arguments5 = c51665vrM.getArguments();
            if (arguments5 != null && arguments5.getBoolean("from_cr_activity", false)) {
                C51665vrM.OLrzqt(c51665vrM).AhwBna.setUserInputEnabled(false);
            } else {
                C51665vrM.OLrzqt(c51665vrM).AhwBna.setUserInputEnabled(true);
            }
        }
        return Unit.INSTANCE;
    }
}
