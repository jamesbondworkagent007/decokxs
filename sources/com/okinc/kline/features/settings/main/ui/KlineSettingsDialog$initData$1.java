package com.okinc.kline.features.settings.main.ui;

import android.os.Bundle;
import android.view.ViewGroup;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import com.okinc.kline.features.settings.main.viewmodel.KlineMainSettingViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C36204oTc;
import o.C54946xaf;
import o.C55118xds;
import o.C56391yDq;
import o.C56442yFn;
import o.wXQ;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineSettingsDialog$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C36204oTc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineSettingsDialog$initData$1(C36204oTc c36204oTc, Continuation<? super KlineSettingsDialog$initData$1> continuation) {
        super(2, continuation);
        this.this$0 = c36204oTc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineSettingsDialog$initData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineSettingsDialog$initData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C36204oTc c36204oTc;
        SettingEntryPoint settingEntryPoint;
        C55118xds root;
        wXQ wxq;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Bundle arguments = this.this$0.getArguments();
            Object obj2 = arguments != null ? arguments.get("entry_point") : null;
            SettingEntryPoint settingEntryPoint2 = obj2 instanceof SettingEntryPoint ? (SettingEntryPoint) obj2 : null;
            if (settingEntryPoint2 != null) {
                c36204oTc = this.this$0;
                KlineMainSettingViewModel klineMainSettingViewModelAYXKKw = c36204oTc.AYXKKw();
                this.L$0 = c36204oTc;
                this.L$1 = settingEntryPoint2;
                this.label = 1;
                if (klineMainSettingViewModelAYXKKw.KWHzl(settingEntryPoint2, this) == objCopydefault) {
                    return objCopydefault;
                }
                settingEntryPoint = settingEntryPoint2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        settingEntryPoint = (SettingEntryPoint) this.L$1;
        c36204oTc = (C36204oTc) this.L$0;
        C56391yDq.AEQbTJ(obj);
        if (settingEntryPoint.AYXKKw()) {
            C54946xaf binding = c36204oTc.getBinding();
            if (binding != null && (wxq = binding.KWHzl) != null) {
                wxq.setVisibility(8);
            }
            c36204oTc.updateMaxHeight(Integer.MAX_VALUE);
            C54946xaf binding2 = c36204oTc.getBinding();
            if (binding2 != null && (root = binding2.getRoot()) != null) {
                ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -1;
                    root.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        return Unit.INSTANCE;
    }
}
