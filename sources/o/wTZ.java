package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.order.strategy.api.dto.grid.CoinAmountDto;
import com.okinc.tradingbot.impl.order.strategy.api.dto.grid.StopBotPreComputeDto;
import com.okinc.tradingbot.impl.order.strategy.data.BotStopType;
import com.okinc.tradingbot.impl.usecase.bot.StopBotPreComputeUseCase$execute$1;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wTZ extends vNH<Application, TaskDescription> {
    public final InterfaceC50053vAd AEQbTJ;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public wTZ(@NotNull InterfaceC50053vAd interfaceC50053vAd, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50053vAd, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC50053vAd;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Application application, @NotNull Continuation<? super TaskDescription> continuation) throws java.lang.Throwable {
        StopBotPreComputeUseCase$execute$1 stopBotPreComputeUseCase$execute$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        AbstractC43419rot actionBar2;
        ResponseData responseData;
        if (continuation instanceof StopBotPreComputeUseCase$execute$1) {
            stopBotPreComputeUseCase$execute$1 = (StopBotPreComputeUseCase$execute$1) continuation;
            int i = stopBotPreComputeUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBotPreComputeUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBotPreComputeUseCase$execute$1 = new StopBotPreComputeUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = stopBotPreComputeUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = stopBotPreComputeUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC50053vAd interfaceC50053vAd = this.AEQbTJ;
                java.lang.String strOLrzqt = application.OLrzqt();
                stopBotPreComputeUseCase$execute$1.label = 1;
                objEZpvd = interfaceC50053vAd.EZpvd(strOLrzqt, stopBotPreComputeUseCase$execute$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            responseData = (ResponseData) objEZpvd;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
            return actionBar2.AEQbTJ();
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            java.util.List<StopBotPreComputeDto> list = (java.util.List) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            for (StopBotPreComputeDto stopBotPreComputeDto : list) {
                BotStopType stopType = stopBotPreComputeDto.getStopType();
                if (stopType == null) {
                    stopType = BotStopType.StopAndSell;
                }
                BotStopType stopType2 = stopBotPreComputeDto.getStopType();
                if (stopType2 == null) {
                    stopType2 = BotStopType.StopAndSell;
                }
                java.util.List<CoinAmountDto> returnCoinAmount = stopBotPreComputeDto.getReturnCoinAmount();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(returnCoinAmount, 10));
                for (CoinAmountDto coinAmountDto : returnCoinAmount) {
                    arrayList.add(C50052vAc.EZpvd(C50052vAc.KWHzl(coinAmountDto.getAmount(), coinAmountDto.getCcy())));
                }
                java.util.List<CoinAmountDto> sellCoinAmount = stopBotPreComputeDto.getSellCoinAmount();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(sellCoinAmount, 10));
                for (CoinAmountDto coinAmountDto2 : sellCoinAmount) {
                    arrayList2.add(C50052vAc.EZpvd(C50052vAc.KWHzl(coinAmountDto2.getAmount(), coinAmountDto2.getCcy())));
                }
                linkedHashMap.put(stopType, new C50056vAg(stopType2, arrayList, arrayList2));
            }
            actionBar2 = new AbstractC43419rot.StateListAnimator(new TaskDescription(linkedHashMap));
        } else {
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar2 = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl());
        }
        return actionBar2.AEQbTJ();
    }

    public static final class Application {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.OLrzqt;
            }
            return application.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((Application) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(algoId=" + this.OLrzqt + ")";
        }

        public Application(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }
    }

    public static final class TaskDescription {
        public final java.util.Map<BotStopType, C50056vAg> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wTZ$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = taskDescription.copydefault;
            }
            return taskDescription.EZpvd(map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<BotStopType, C50056vAg> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.util.Map<BotStopType, C50056vAg> map) {
            Intrinsics.checkNotNullParameter(map, "");
            return new TaskDescription(map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.copydefault, ((TaskDescription) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(results=" + this.copydefault + ")";
        }

        public TaskDescription(@NotNull java.util.Map<BotStopType, C50056vAg> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.copydefault = map;
        }
    }
}
