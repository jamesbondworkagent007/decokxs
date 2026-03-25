package com.okinc.ok_kyc_core.presentation.formTemplate;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42074rFj;
import o.AbstractC43728ruk;
import o.C43734ruq;
import o.C56391yDq;
import o.C56442yFn;
import o.rBL;
import o.rGL;

/* JADX INFO: loaded from: classes16.dex */
public final class FormViewModel$getInfoFormEntryDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ String $id;
    final /* synthetic */ Function1<HashMap<String, ValueAndName>, Unit> $nextCallBack;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ rGL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.HashMap<java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName>, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FormViewModel$getInfoFormEntryDetail$1(rGL rgl, String str, Map<String, String> map, String str2, FragmentActivity fragmentActivity, Function1<? super HashMap<String, ValueAndName>, Unit> function1, Continuation<? super FormViewModel$getInfoFormEntryDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = rgl;
        this.$url = str;
        this.$params = map;
        this.$id = str2;
        this.$activity = fragmentActivity;
        this.$nextCallBack = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FormViewModel$getInfoFormEntryDetail$1(this.this$0, this.$url, this.$params, this.$id, this.$activity, this.$nextCallBack, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FormViewModel$getInfoFormEntryDetail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            rBL rblOLrzqt = this.this$0.QKVWgx().OLrzqt();
            String str = this.$url;
            Map<String, String> map = this.$params;
            String str2 = this.$id;
            this.label = 1;
            obj = rblOLrzqt.OLrzqt(str, map, str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) obj;
        rGL rgl = this.this$0;
        FragmentActivity fragmentActivity = this.$activity;
        Function1<HashMap<String, ValueAndName>, Unit> function1 = this.$nextCallBack;
        if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
            HashMap<String, ValueAndName> map2 = (HashMap) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).KWHzl();
            AbstractC42074rFj.cancelLoading$default(rgl, null, fragmentActivity, false, 4, null);
            function1.invoke(map2);
        }
        rGL rgl2 = this.this$0;
        FragmentActivity fragmentActivity2 = this.$activity;
        if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
            ResponseFailedException responseFailedException = (ResponseFailedException) ((AbstractC43728ruk.TaskDescription) abstractC43728ruk).OLrzqt();
            AbstractC42074rFj.cancelLoading$default(rgl2, null, fragmentActivity2, false, 4, null);
            MutableLiveData newProxyInstance = rgl2.getNewProxyInstance();
            String message = responseFailedException.getMessage();
            if (message == null) {
                message = "";
            }
            newProxyInstance.setValue(new C43734ruq(message));
        }
        return Unit.INSTANCE;
    }
}
