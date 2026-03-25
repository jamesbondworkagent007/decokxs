package com.okinc.auth.impl.passkey.ui.resetremove.mfa;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.impl.passkey.ui.resetremove.mfa.ResetRemovePasskeyMfaViewModel$remove$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C32866mlf;
import o.C32868mlh;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5919aFZ;
import o.C5922aFc;
import o.C8206ayP;
import o.yDY;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetRemovePasskeyMfaViewModel$remove$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    Object L$0;
    int label;
    final /* synthetic */ ResetRemovePasskeyMfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetRemovePasskeyMfaViewModel$remove$1(ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel, String str, Continuation<? super ResetRemovePasskeyMfaViewModel$remove$1> continuation) {
        super(2, continuation);
        this.this$0 = resetRemovePasskeyMfaViewModel;
        this.$sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResetRemovePasskeyMfaViewModel$remove$1(this.this$0, this.$sessionId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetRemovePasskeyMfaViewModel$remove$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.AYXKKw;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objOLrzqt = ((Result) obj).m7386unboximpl();
                    mutableSharedFlow = this.this$0.AYXKKw;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = objOLrzqt;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objOLrzqt;
                    ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel3 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("PasskeySingleRemoveSuccessfully_Account_API_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aOZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return ResetRemovePasskeyMfaViewModel$remove$1.invokeSuspend$lambda$1$lambda$0((EventParamsList) obj3);
                        }
                    });
                    resetRemovePasskeyMfaViewModel3.gEmmrt.setValue(C33070mpX.AYXKKw(C8206ayP.Dialog.djSkpj));
                }
                ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    C5922aFc c5922aFc = C5922aFc.KWHzl;
                    String strEZpvd = ResetRemovePasskeyMfaViewModel.Companion.EZpvd();
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, strEZpvd + " remove() " + message, 2, null);
                    MutableLiveData mutableLiveData = resetRemovePasskeyMfaViewModel22.djBIcL;
                    String message2 = thM7380exceptionOrNullimpl.getMessage();
                    mutableLiveData.setValue(message2 != null ? message2 : "");
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5919aFZ c5919aFZ = this.this$0.zLjUOn;
        Pair pair = (Pair) this.this$0.AEQbTJ.getValue();
        List listAhwBna = pair != null ? (List) pair.getSecond() : null;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        String str = (String) CollectionsKt___CollectionsKt.AuCTelauCTel(listAhwBna);
        String str2 = this.$sessionId;
        this.label = 2;
        objOLrzqt = c5919aFZ.OLrzqt(str, str2, this);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        mutableSharedFlow = this.this$0.AYXKKw;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = objOLrzqt;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(EventParamsList eventParamsList) {
        eventParamsList.put("flow", "passkey", true);
        return Unit.INSTANCE;
    }
}
