package com.okinc.tradingbot.impl.market_place.home.list.presenter;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.biz.TacticsType;
import com.okinc.tradingbot.impl.market_place.home.list.presenter.BotFeaturedPresenter;
import com.okinc.unify_trade.biz.BotCreateCardItem;
import com.okinc.unify_trade.biz.BotCreateContentItem;
import com.okinc.unify_trade.biz.BotCreateTitleItem;
import com.okinc.unify_trade.biz.CategoryItem;
import com.okinc.unify_trade.biz.CategoryTag;
import com.okinc.unify_trade.biz.ChatCommunityItem;
import com.okinc.unify_trade.biz.CustomerServiceAndChatItem;
import com.okinc.unify_trade.biz.MpCategory;
import com.okinc.unify_trade.biz.NmpBotSquareGuideItem;
import com.okinc.unify_trade.biz.OrderCategory;
import com.okinc.unify_trade.biz.RecommendBulletItem;
import com.okinc.unify_trade.biz.RecommendBulletMPData;
import com.okinc.unify_trade.biz.RecommendBulletMPDataB;
import com.okinc.unify_trade.biz.UserTradeConfigInfo;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import com.okinc.unify_trade.trade.utils.TradeAbTestManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C43251rlk;
import o.C48033uCm;
import o.C48291uMa;
import o.C51468vnb;
import o.C51469vnc;
import o.C52686wUp;
import o.C52761wXj;
import o.C54589xNz;
import o.C55688xof;
import o.C55886xsR;
import o.C56284xzs;
import o.C56402yEa;
import o.InterfaceC33171mrS;
import o.InterfaceC49317umK;
import o.InterfaceC54581xNr;
import o.InterfaceC55881xsM;
import o.uLS;
import o.xKK;
import o.xOR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotFeaturedPresenter extends AbsPresenter {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final MutableLiveData<ArrayList<RecommendBulletMPData>> AEQbTJ;
    public final C56284xzs OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ArrayList<RecommendBulletMPData>> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56284xzs OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotFeaturedPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = new C56284xzs();
        this.AEQbTJ = new MutableLiveData<>();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.home.list.presenter.BotFeaturedPresenter.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final boolean EZpvd() {
        return C48291uMa.Companion.AEQbTJ().EZpvd();
    }

    public static /* synthetic */ List getBotFeaturedConfig$default(BotFeaturedPresenter botFeaturedPresenter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return botFeaturedPresenter.KWHzl(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Object> KWHzl(boolean z) {
        List<MpCategory> listAEQbTJ;
        MpCategory mpCategory;
        BotCreateContentItem botCreateContentItem;
        List<OrderCategory> listAEQbTJ2;
        Object next;
        C51469vnc c51469vncAEQbTJ;
        BotCreateCardItem botCreateCardItem;
        List<OrderCategory> listAEQbTJ3;
        Object next2;
        C51469vnc c51469vncConvertSelectBotConfig$default;
        BotCreateCardItem botCreateCardItem2;
        String strAYXKKw;
        List<? extends Object> arrayList = new ArrayList<>();
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        xOR xorCopydefault = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.copydefault() : null;
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault != null && (listAEQbTJ = interfaceC55881xsMCopydefault.AEQbTJ()) != null && (mpCategory = (MpCategory) CollectionsKt___CollectionsKt.firstOrNull(listAEQbTJ)) != null) {
            List<String> defaultContent = mpCategory.getDefaultContent();
            ArrayList arrayList2 = new ArrayList();
            for (String str : defaultContent) {
                if (Intrinsics.EZpvd((Object) str, (Object) "create")) {
                    botCreateCardItem2 = new BotCreateCardItem(str, null, C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0), Integer.valueOf(C52761wXj.TaskDescription.onLocationChanged), Integer.valueOf(C52761wXj.Activity.QHmsKR), Integer.valueOf(C52761wXj.Activity.htlTjW), 2, null);
                } else {
                    if (xorCopydefault != null && (listAEQbTJ3 = xorCopydefault.AEQbTJ()) != null) {
                        Iterator<T> it = listAEQbTJ3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                            if (Intrinsics.EZpvd((Object) ((OrderCategory) next2).getStrategyType(), (Object) str)) {
                                break;
                            }
                        }
                        OrderCategory orderCategory = (OrderCategory) next2;
                        if (orderCategory != null && (c51469vncConvertSelectBotConfig$default = C51468vnb.convertSelectBotConfig$default(str, false, 2, null)) != null) {
                            List<CategoryTag> tags = orderCategory.getTags();
                            TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(str);
                            botCreateCardItem2 = new BotCreateCardItem(str, tags, (tacticsTypeAEQbTJ == null || (strAYXKKw = C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName())) == null) ? "" : strAYXKKw, Integer.valueOf(c51469vncConvertSelectBotConfig$default.copydefault()), Integer.valueOf(C52761wXj.Activity.invokespecialDPHOMC), Integer.valueOf(C52761wXj.Activity.fdOvFl));
                        }
                    }
                    botCreateCardItem = null;
                    if (botCreateCardItem == null) {
                        arrayList2.add(botCreateCardItem);
                    }
                }
                botCreateCardItem = botCreateCardItem2;
                if (botCreateCardItem == null) {
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (hashSet.add(((BotCreateCardItem) obj).getBotType())) {
                    arrayList3.add(obj);
                }
            }
            arrayList.addAll(arrayList3);
            int i = 0;
            for (Object obj2 : mpCategory.getExtra()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                CategoryItem categoryItem = (CategoryItem) obj2;
                List<String> content = categoryItem.getContent();
                ArrayList arrayList4 = new ArrayList();
                for (String str2 : content) {
                    if (xorCopydefault == null || (listAEQbTJ2 = xorCopydefault.AEQbTJ()) == null) {
                        botCreateContentItem = null;
                    } else {
                        Iterator<T> it2 = listAEQbTJ2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            if (Intrinsics.EZpvd((Object) ((OrderCategory) next).getStrategyType(), (Object) str2)) {
                                break;
                            }
                        }
                        OrderCategory orderCategory2 = (OrderCategory) next;
                        if (orderCategory2 != null && (c51469vncAEQbTJ = C51468vnb.AEQbTJ(str2, EZpvd())) != null) {
                            TacticsType tacticsTypeAEQbTJ2 = TacticsType.Companion.AEQbTJ(str2);
                            String strAYXKKw2 = tacticsTypeAEQbTJ2 != null ? C33070mpX.AYXKKw(tacticsTypeAEQbTJ2.getStgyName()) : null;
                            if (strAYXKKw2 == null) {
                                strAYXKKw2 = "";
                            }
                            if (EZpvd()) {
                                String strKWHzl = c51469vncAEQbTJ.KWHzl();
                                String str3 = strKWHzl.length() == 0 ? strAYXKKw2 : strKWHzl;
                                botCreateContentItem = new BotCreateContentItem(str2, orderCategory2.getTags(), str3, c51469vncAEQbTJ.AEQbTJ(), Integer.valueOf(c51469vncAEQbTJ.copydefault()));
                            }
                        }
                    }
                    if (botCreateContentItem != null) {
                        arrayList4.add(botCreateContentItem);
                    }
                }
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList4) {
                    if (hashSet2.add(((BotCreateContentItem) obj3).getBotType())) {
                        arrayList5.add(obj3);
                    }
                }
                if ((!arrayList5.isEmpty()) && z) {
                    arrayList.add(new BotCreateTitleItem(categoryItem.getName()));
                    arrayList.addAll(arrayList5);
                }
                if (i == 0 && ((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).OLrzqt()) {
                    ArrayList<RecommendBulletMPData> value = this.AEQbTJ.getValue();
                    if (value != null) {
                        if (value.size() > 0) {
                            RecommendBulletMPData recommendBulletMPData = (RecommendBulletMPData) CollectionsKt___CollectionsKt.AuCTelauCTel(value);
                            List<RecommendBulletItem> bulletChatInfo = recommendBulletMPData.getBulletChatInfo();
                            if (bulletChatInfo == null || bulletChatInfo.isEmpty()) {
                                arrayList.add(new NmpBotSquareGuideItem(C33070mpX.AYXKKw(C48033uCm.Fragment.invokespecialatDTRm), C33070mpX.AYXKKw(C48033uCm.Fragment.invokespecialRuDPQV)));
                            } else if (TradeAbTestManager.copydefault.OLrzqt()) {
                                arrayList.add(recommendBulletMPData);
                            } else {
                                RecommendBulletMPDataB recommendBulletMPDataB = new RecommendBulletMPDataB(null, null, 3, null);
                                recommendBulletMPDataB.setBulletChatInfo(recommendBulletMPData.getBulletChatInfo());
                                recommendBulletMPDataB.setLatestInvestors(recommendBulletMPData.getLatestInvestors());
                                arrayList.add(recommendBulletMPDataB);
                            }
                        }
                    } else {
                        arrayList.add(new NmpBotSquareGuideItem(C33070mpX.AYXKKw(C48033uCm.Fragment.invokespecialatDTRm), C33070mpX.AYXKKw(C48033uCm.Fragment.invokespecialRuDPQV)));
                    }
                }
                i++;
            }
        }
        uLS uls = uLS.AEQbTJ;
        if (uls.valueOf() && z && !EZpvd()) {
            if (uls.AYXKKw() && TradeAbTestManager.copydefault.AYXKKw()) {
                arrayList.add(CustomerServiceAndChatItem.INSTANCE);
            } else {
                arrayList.add(new ChatCommunityItem(C33070mpX.AYXKKw(C48033uCm.Fragment.invokespecialODCBUN), C33070mpX.AYXKKw(C48033uCm.Fragment.invokespecialROgMPW)));
            }
        }
        if (C52686wUp.OLrzqt.AEQbTJ() && xorCopydefault != null && !xorCopydefault.gEmmrt() && ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames() && z) {
            arrayList.add(OLrzqt(arrayList, new Function1() { // from class: o.von
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj4) {
                    return java.lang.Boolean.valueOf(BotFeaturedPresenter.KWHzl(obj4));
                }
            }, new Function1() { // from class: o.vol
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj4) {
                    return java.lang.Boolean.valueOf(BotFeaturedPresenter.copydefault(obj4));
                }
            }, new Function1() { // from class: o.vom
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj4) {
                    return java.lang.Boolean.valueOf(BotFeaturedPresenter.AYXKKw(obj4));
                }
            }) + 1, new BotCreateContentItem("BOT_TYPE_CONTRACT_GRID_COINM", C56402yEa.EZpvd(new CategoryTag(C33070mpX.AYXKKw(C48033uCm.Fragment.QVsKAR), "", null, 4, null)), C33070mpX.AYXKKw(C48033uCm.Fragment.invokespecialDaTmkG), C33070mpX.AYXKKw(C48033uCm.Fragment.iqMDAV), Integer.valueOf(C52761wXj.TaskDescription.DcMfJKDGTeJD)));
        }
        return arrayList;
    }

    public static final boolean KWHzl(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (obj instanceof BotCreateContentItem) && Intrinsics.EZpvd((Object) ((BotCreateContentItem) obj).getBotType(), (Object) "contract_dca");
    }

    public static final boolean copydefault(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (obj instanceof BotCreateContentItem) && Intrinsics.EZpvd((Object) ((BotCreateContentItem) obj).getBotType(), (Object) "ai_bot");
    }

    public static final boolean AYXKKw(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof BotCreateTitleItem;
    }

    public final int OLrzqt(List<? extends Object> list, Function1<Object, Boolean>... function1Arr) {
        for (Function1<Object, Boolean> function1 : function1Arr) {
            Iterator<? extends Object> it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (function1.invoke(it.next()).booleanValue()) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                return i;
            }
        }
        return -1;
    }

    public final boolean OLrzqt(@NotNull String str) {
        UserTradeConfigInfo userTradeConfigInfoGHZMYf;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        return interfaceC54581xNrCopydefault != null && (userTradeConfigInfoGHZMYf = interfaceC54581xNrCopydefault.gHZMYf()) != null && userTradeConfigInfoGHZMYf.getRoleType() == 1 && C51468vnb.DbNXlk().contains(str);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.OLrzqt);
    }

    public final void copydefault() {
        C56284xzs c56284xzs = this.OLrzqt;
        c56284xzs.AEQbTJ(this.AEQbTJ);
        xKK.Activity.execute$default(c56284xzs, 0L, 1, null);
    }
}
