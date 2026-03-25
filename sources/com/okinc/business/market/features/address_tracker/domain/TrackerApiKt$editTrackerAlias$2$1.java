package com.okinc.business.market.features.address_tracker.domain;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28603kdr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.jAT;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerApiKt$editTrackerAlias$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ Function1<String, Unit> $callback;
    final /* synthetic */ String $collectAddress;
    final /* synthetic */ DexUserIdentity $dexId;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ String $holderAddress;
    final /* synthetic */ C28603kdr $jwtUseCase;
    final /* synthetic */ String $originalAlias;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TrackerApiKt$editTrackerAlias$2$1(C28603kdr c28603kdr, String str, DexUserIdentity dexUserIdentity, Bundle bundle, FragmentManager fragmentManager, String str2, String str3, Function1<? super String, Unit> function1, Continuation<? super TrackerApiKt$editTrackerAlias$2$1> continuation) {
        super(2, continuation);
        this.$jwtUseCase = c28603kdr;
        this.$holderAddress = str;
        this.$dexId = dexUserIdentity;
        this.$bundle = bundle;
        this.$fragmentManager = fragmentManager;
        this.$collectAddress = str2;
        this.$originalAlias = str3;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerApiKt$editTrackerAlias$2$1(this.$jwtUseCase, this.$holderAddress, this.$dexId, this.$bundle, this.$fragmentManager, this.$collectAddress, this.$originalAlias, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerApiKt$editTrackerAlias$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28603kdr c28603kdr = this.$jwtUseCase;
            String str = this.$holderAddress;
            long jOLrzqt = this.$dexId.OLrzqt();
            Bundle bundle = this.$bundle;
            this.label = 1;
            objKWHzl = c28603kdr.KWHzl(str, jOLrzqt, bundle, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            objKWHzl = C56443yFo.KWHzl(false);
        }
        Boolean bool = (Boolean) objKWHzl;
        if (bool != null && bool.booleanValue()) {
            jAT.copydefault(this.$fragmentManager, this.$collectAddress, this.$originalAlias, this.$callback);
        }
        return Unit.INSTANCE;
    }
}
