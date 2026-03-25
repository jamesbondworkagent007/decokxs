package com.okinc.business.defi.wallet.home.addressDetail.domain.usecase;

import com.okinc.business.defi.biz.net.bean.WalletPnlShareInfoResponse;
import com.okinc.business.defi.wallet.home.addressDetail.utils.WalletTokenPnlShareInfo;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC43419rot;
import o.C15839eXe;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSharePnlTokenUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends WalletTokenPnlShareInfo>>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    final /* synthetic */ String $walletAddress;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ C15839eXe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSharePnlTokenUseCase$invoke$2(String str, String str2, C15839eXe c15839eXe, String str3, String str4, Continuation<? super WalletSharePnlTokenUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$chainId = str;
        this.$walletAddress = str2;
        this.this$0 = c15839eXe;
        this.$tokenContractAddress = str3;
        this.$accountId = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletSharePnlTokenUseCase$invoke$2 walletSharePnlTokenUseCase$invoke$2 = new WalletSharePnlTokenUseCase$invoke$2(this.$chainId, this.$walletAddress, this.this$0, this.$tokenContractAddress, this.$accountId, continuation);
        walletSharePnlTokenUseCase$invoke$2.L$0 = obj;
        return walletSharePnlTokenUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends WalletTokenPnlShareInfo>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<WalletTokenPnlShareInfo>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<WalletTokenPnlShareInfo>> continuation) {
        return ((WalletSharePnlTokenUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Deferred deferredAsync$default;
        Object objAwait;
        String str;
        String str2;
        long j;
        Object objAwait2;
        WalletPnlShareInfoResponse walletPnlShareInfoResponse;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        List<JsonObject> list;
        String str15;
        String str16;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            String str17 = this.$chainId;
            String str18 = this.$walletAddress;
            C15839eXe c15839eXe = this.this$0;
            String str19 = this.$tokenContractAddress;
            String str20 = this.$accountId;
            Result.Application application2 = Result.Companion;
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new WalletSharePnlTokenUseCase$invoke$2$1$isSelfSharingDeferred$1(c15839eXe, str18, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new WalletSharePnlTokenUseCase$invoke$2$1$apiResultDeferred$1(c15839eXe, str17, str19, str20, str18, null), 3, null);
            this.L$0 = str17;
            this.L$1 = str18;
            this.L$2 = deferredAsync$default;
            this.label = 1;
            objAwait = deferredAsync$default2.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            str = str17;
            str2 = str18;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                String str21 = (String) this.L$15;
                String str22 = (String) this.L$14;
                String str23 = (String) this.L$13;
                String str24 = (String) this.L$12;
                String str25 = (String) this.L$11;
                List<JsonObject> list2 = (List) this.L$10;
                String str26 = (String) this.L$9;
                String str27 = (String) this.L$8;
                String str28 = (String) this.L$7;
                String str29 = (String) this.L$6;
                String str30 = (String) this.L$5;
                String str31 = (String) this.L$4;
                String str32 = (String) this.L$3;
                String str33 = (String) this.L$2;
                walletPnlShareInfoResponse = (WalletPnlShareInfoResponse) this.L$1;
                String str34 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str3 = str34;
                str16 = str22;
                str15 = str23;
                str12 = str24;
                str14 = str25;
                list = list2;
                str7 = str26;
                str8 = str27;
                str9 = str28;
                str10 = str29;
                str11 = str30;
                str6 = str31;
                str13 = str32;
                str4 = str21;
                str5 = str33;
                objAwait2 = obj;
                String twitterAvatar = walletPnlShareInfoResponse.getTwitterAvatar();
                objM7377constructorimpl = Result.m7377constructorimpl(new WalletTokenPnlShareInfo(str12, str15, str16, str11, C56443yFo.KWHzl(j), str10, str9, str6, str8, str7, str4, list, str14, str13, str5, str3, (Boolean) objAwait2, twitterAvatar));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            Deferred deferred = (Deferred) this.L$2;
            str2 = (String) this.L$1;
            str = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            deferredAsync$default = deferred;
            objAwait = obj;
        }
        WalletPnlShareInfoResponse walletPnlShareInfoResponse2 = (WalletPnlShareInfoResponse) ((AbstractC43419rot) objAwait).AEQbTJ();
        long jValueOf = C33129mqd.valueOf(str);
        String tokenSymbol = walletPnlShareInfoResponse2.getTokenSymbol();
        String tokenLogoUrl = walletPnlShareInfoResponse2.getTokenLogoUrl();
        String currentCurrencyProfit = walletPnlShareInfoResponse2.getCurrentCurrencyProfit();
        String boughtVolume = walletPnlShareInfoResponse2.getBoughtVolume();
        String chainLogoUrl = walletPnlShareInfoResponse2.getChainLogoUrl();
        String currencyName = walletPnlShareInfoResponse2.getCurrencyName();
        String currentPrice = walletPnlShareInfoResponse2.getCurrentPrice();
        String currentProfit = walletPnlShareInfoResponse2.getCurrentProfit();
        List<JsonObject> kLinesData = walletPnlShareInfoResponse2.getKLinesData();
        String soldVolume = walletPnlShareInfoResponse2.getSoldVolume();
        Deferred deferred2 = deferredAsync$default;
        String averageCost = walletPnlShareInfoResponse2.getAverageCost();
        String averageSell = walletPnlShareInfoResponse2.getAverageSell();
        String balance = walletPnlShareInfoResponse2.getBalance();
        String currentProfitPercentage = walletPnlShareInfoResponse2.getCurrentProfitPercentage();
        this.L$0 = str2;
        this.L$1 = walletPnlShareInfoResponse2;
        this.L$2 = tokenSymbol;
        this.L$3 = tokenLogoUrl;
        this.L$4 = currentCurrencyProfit;
        this.L$5 = boughtVolume;
        this.L$6 = chainLogoUrl;
        this.L$7 = currencyName;
        this.L$8 = currentPrice;
        this.L$9 = currentProfit;
        this.L$10 = kLinesData;
        this.L$11 = soldVolume;
        this.L$12 = averageCost;
        this.L$13 = averageSell;
        this.L$14 = balance;
        this.L$15 = currentProfitPercentage;
        j = jValueOf;
        this.J$0 = j;
        this.label = 2;
        objAwait2 = deferred2.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        walletPnlShareInfoResponse = walletPnlShareInfoResponse2;
        str3 = str2;
        str4 = currentProfitPercentage;
        str5 = tokenSymbol;
        str6 = currentCurrencyProfit;
        str7 = currentProfit;
        str8 = currentPrice;
        str9 = currencyName;
        str10 = chainLogoUrl;
        str11 = boughtVolume;
        str12 = averageCost;
        str13 = tokenLogoUrl;
        str14 = soldVolume;
        list = kLinesData;
        str15 = averageSell;
        str16 = balance;
        String twitterAvatar2 = walletPnlShareInfoResponse.getTwitterAvatar();
        objM7377constructorimpl = Result.m7377constructorimpl(new WalletTokenPnlShareInfo(str12, str15, str16, str11, C56443yFo.KWHzl(j), str10, str9, str6, str8, str7, str4, list, str14, str13, str5, str3, (Boolean) objAwait2, twitterAvatar2));
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
