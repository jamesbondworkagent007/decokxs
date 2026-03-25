package o;

import com.okinc.business.data.model.market.HolderRankingResponseData;
import com.okinc.business.data.model.market.TokenHolderResponseData;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
import com.okinc.business.market.features.holders.domain.usecase.MapHolderUseCase$batchMap$1;
import com.okinc.business.market.features.holders.domain.usecase.MapHolderUseCase$batchMap0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.holders.domain.usecase.MapHolderUseCase$map$1;
import com.okinc.business.market.features.holders.domain.usecase.MapHolderUseCase$map$3;
import com.okinc.business.market.features.holders.domain.usecase.MapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.holders.domain.usecase.MapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jYH {
    public final jAH AEQbTJ;
    public final C27634jyr EZpvd;
    public java.util.Map<java.lang.String, TrackingAddressAlias> KWHzl;
    public final C29712kyn OLrzqt;
    public final CoroutineDispatcher copydefault;

    public static final class ActionBar implements Function0<java.lang.String> {
        public static final ActionBar OLrzqt = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke() {
            return "--";
        }
    }

    public static final class Activity implements Function0<java.lang.String> {
        public static final Activity copydefault = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke() {
            return "--";
        }
    }

    public static final class Application implements Function0<java.lang.String> {
        public static final Application OLrzqt = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke() {
            return "--";
        }
    }

    public static final class TaskDescription implements Function0<java.lang.String> {
        public static final TaskDescription OLrzqt = new TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke() {
            return "--";
        }
    }

    @yCM
    public jYH(@NotNull C29712kyn c29712kyn, @NotNull C27634jyr c27634jyr, @NotNull jAH jah, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29712kyn, "");
        Intrinsics.checkNotNullParameter(c27634jyr, "");
        Intrinsics.checkNotNullParameter(jah, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = c29712kyn;
        this.EZpvd = c27634jyr;
        this.AEQbTJ = jah;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull TokenHolderResponseData tokenHolderResponseData, java.lang.Integer num, @NotNull Continuation<? super Result<C26287jYw>> continuation) {
        MapHolderUseCase$map$1 mapHolderUseCase$map$1;
        if (continuation instanceof MapHolderUseCase$map$1) {
            mapHolderUseCase$map$1 = (MapHolderUseCase$map$1) continuation;
            int i = mapHolderUseCase$map$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapHolderUseCase$map$1.label = i - Integer.MIN_VALUE;
            } else {
                mapHolderUseCase$map$1 = new MapHolderUseCase$map$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = mapHolderUseCase$map$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mapHolderUseCase$map$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            MapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$1 mapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$1 = new MapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$1(null, tokenHolderResponseData, this, num);
            mapHolderUseCase$map$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$1, mapHolderUseCase$map$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull HolderRankingResponseData holderRankingResponseData, int i, @NotNull Continuation<? super Result<HolderDetailModel>> continuation) {
        MapHolderUseCase$map$3 mapHolderUseCase$map$3;
        if (continuation instanceof MapHolderUseCase$map$3) {
            mapHolderUseCase$map$3 = (MapHolderUseCase$map$3) continuation;
            int i2 = mapHolderUseCase$map$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapHolderUseCase$map$3.label = i2 - Integer.MIN_VALUE;
            } else {
                mapHolderUseCase$map$3 = new MapHolderUseCase$map$3(this, continuation);
            }
        }
        java.lang.Object objWithContext = mapHolderUseCase$map$3.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = mapHolderUseCase$map$3.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            MapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$2 mapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$2 = new MapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$2(null, holderRankingResponseData, this, i);
            mapHolderUseCase$map$3.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$2, mapHolderUseCase$map$3);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: batchMap-0E7RQCE$OKDex_dex_impl$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8644batchMap0E7RQCE$OKDex_dex_impl$default(jYH jyh, java.util.List list, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return jyh.copydefault((java.util.List<HolderRankingResponseData>) list, num, (Continuation<? super Result<? extends java.util.List<HolderDetailModel>>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.util.List<HolderRankingResponseData> list, java.lang.Integer num, @NotNull Continuation<? super Result<? extends java.util.List<HolderDetailModel>>> continuation) {
        MapHolderUseCase$batchMap$1 mapHolderUseCase$batchMap$1;
        if (continuation instanceof MapHolderUseCase$batchMap$1) {
            mapHolderUseCase$batchMap$1 = (MapHolderUseCase$batchMap$1) continuation;
            int i = mapHolderUseCase$batchMap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapHolderUseCase$batchMap$1.label = i - Integer.MIN_VALUE;
            } else {
                mapHolderUseCase$batchMap$1 = new MapHolderUseCase$batchMap$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = mapHolderUseCase$batchMap$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mapHolderUseCase$batchMap$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            MapHolderUseCase$batchMap0E7RQCE$$inlined$dexRunCatching$1 mapHolderUseCase$batchMap0E7RQCE$$inlined$dexRunCatching$1 = new MapHolderUseCase$batchMap0E7RQCE$$inlined$dexRunCatching$1(null, num, list, this);
            mapHolderUseCase$batchMap$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mapHolderUseCase$batchMap0E7RQCE$$inlined$dexRunCatching$1, mapHolderUseCase$batchMap$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
