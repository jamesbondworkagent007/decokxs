package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.LiquidityListItem;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedLiquidityUseCase$fetchLiquidity$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedLiquidityUseCase$fetchLiquidity0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kRf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28163kRf {
    public final CoroutineDispatcher AEQbTJ;
    public final kQA copydefault;

    @yCM
    public C28163kRf(@NotNull kQA kqa, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kqa, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = kqa;
        this.AEQbTJ = coroutineDispatcher;
    }

    public final MutableLiveData<java.util.List<java.lang.String>> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd(str).OLrzqt();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        AdvancedLiquidityUseCase$fetchLiquidity$1 advancedLiquidityUseCase$fetchLiquidity$1;
        if (continuation instanceof AdvancedLiquidityUseCase$fetchLiquidity$1) {
            advancedLiquidityUseCase$fetchLiquidity$1 = (AdvancedLiquidityUseCase$fetchLiquidity$1) continuation;
            int i = advancedLiquidityUseCase$fetchLiquidity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedLiquidityUseCase$fetchLiquidity$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedLiquidityUseCase$fetchLiquidity$1 = new AdvancedLiquidityUseCase$fetchLiquidity$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedLiquidityUseCase$fetchLiquidity$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedLiquidityUseCase$fetchLiquidity$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            AdvancedLiquidityUseCase$fetchLiquidity0E7RQCE$$inlined$dexRunCatching$1 advancedLiquidityUseCase$fetchLiquidity0E7RQCE$$inlined$dexRunCatching$1 = new AdvancedLiquidityUseCase$fetchLiquidity0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            advancedLiquidityUseCase$fetchLiquidity$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedLiquidityUseCase$fetchLiquidity0E7RQCE$$inlined$dexRunCatching$1, advancedLiquidityUseCase$fetchLiquidity$1);
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

    /* JADX INFO: renamed from: o.kRf$Activity */
    public static final class Activity implements Function1<ResponseData<java.util.List<? extends LiquidityListItem>>, Unit> {
        public final /* synthetic */ C28163kRf AEQbTJ;
        public final /* synthetic */ InterfaceC22646hjL KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(InterfaceC22646hjL interfaceC22646hjL, java.lang.String str, C28163kRf c28163kRf, java.lang.String str2) {
            this.KWHzl = interfaceC22646hjL;
            this.OLrzqt = str;
            this.AEQbTJ = c28163kRf;
            this.copydefault = str2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ResponseData<java.util.List<? extends LiquidityListItem>> responseData) {
            AEQbTJ(responseData);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(ResponseData<java.util.List<LiquidityListItem>> responseData) {
            InterfaceC22646hjL interfaceC22646hjL = this.KWHzl;
            java.lang.String str = this.OLrzqt;
            java.util.List<LiquidityListItem> data = responseData.getData();
            if (data == null) {
                data = yDY.AhwBna();
            }
            interfaceC22646hjL.EZpvd(str, data);
            this.AEQbTJ.copydefault(this.copydefault).setValue(null);
        }
    }

    /* JADX INFO: renamed from: o.kRf$TaskDescription */
    public static final class TaskDescription implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ InterfaceC22646hjL EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(InterfaceC22646hjL interfaceC22646hjL) {
            this.EZpvd = interfaceC22646hjL;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            KWHzl(th);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.Throwable th) {
            this.EZpvd.AEQbTJ();
            this.EZpvd.copydefault(true);
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(str).AEQbTJ();
    }

    public final java.util.List<java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.List<LiquidityListItem> list = EZpvd(str).KWHzl().get(C24695iig.copydefault(str2, str2));
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LiquidityListItem) it.next()).getId());
        }
        return arrayList;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.List<java.lang.String> listKWHzl = KWHzl(str, str2);
        if (listKWHzl == null) {
            return "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listKWHzl) {
            java.lang.String str3 = (java.lang.String) obj;
            if (list != null && (!list.contains(str3))) {
                arrayList.add(obj);
            }
        }
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
        return strJoinToString$default != null ? strJoinToString$default : "";
    }

    public final InterfaceC22646hjL EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C22380heK.OLrzqt.copydefault(str).EZpvd(true).gEmmrt();
    }
}
