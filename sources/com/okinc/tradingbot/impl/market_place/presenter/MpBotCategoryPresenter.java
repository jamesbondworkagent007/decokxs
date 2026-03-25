package com.okinc.tradingbot.impl.market_place.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.biz.TacticsType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.unify_trade.biz.CategoryItem;
import com.okinc.unify_trade.biz.CategoryTag;
import com.okinc.unify_trade.biz.MpCategory;
import com.okinc.unify_trade.biz.OrderCategory;
import com.okinc.unify_trade.bot.data.BotSelectedData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C43251rlk;
import o.C48033uCm;
import o.C51468vnb;
import o.C51469vnc;
import o.C51484vnr;
import o.C51938vwU;
import o.C52686wUp;
import o.C52761wXj;
import o.C54589xNz;
import o.C56402yEa;
import o.C56403yEb;
import o.InterfaceC33171mrS;
import o.InterfaceC54581xNr;
import o.xKK;
import o.xOR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class MpBotCategoryPresenter extends AbsPresenter {
    public MpCategory KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull MpCategory mpCategory) {
        Intrinsics.checkNotNullParameter(mpCategory, "");
        this.KWHzl = mpCategory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MpBotCategoryPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public final MpCategory OLrzqt() {
        MpCategory mpCategory = this.KWHzl;
        if (mpCategory != null) {
            return mpCategory;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<BotSelectedData> EZpvd() {
        BotSelectedData botSelectedDataAEQbTJ;
        Object next;
        ArrayList arrayList = new ArrayList();
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        xOR xorCopydefault = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.copydefault() : null;
        List<OrderCategory> listAEQbTJ = xorCopydefault != null ? xorCopydefault.AEQbTJ() : null;
        List<String> listQbewEr = CollectionsKt___CollectionsKt.QbewEr(OLrzqt().getDefaultContent());
        ArrayList arrayList2 = new ArrayList();
        for (String str : listQbewEr) {
            if (listAEQbTJ != null) {
                Iterator<T> it = listAEQbTJ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((OrderCategory) next).getStrategyType(), (Object) str)) {
                        break;
                    }
                }
                OrderCategory orderCategory = (OrderCategory) next;
                botSelectedDataAEQbTJ = orderCategory == null ? null : AEQbTJ(orderCategory);
            }
            if (botSelectedDataAEQbTJ != null) {
                arrayList2.add(botSelectedDataAEQbTJ);
            }
        }
        arrayList.addAll(arrayList2);
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.EZpvd((Object) ((BotSelectedData) it2.next()).getBotType(), (Object) "contract_grid")) {
                break;
            }
            i++;
        }
        if (C52686wUp.OLrzqt.AEQbTJ() && xorCopydefault != null && !xorCopydefault.gEmmrt() && ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames() && i != -1) {
            arrayList.add(i + 1, new BotSelectedData("BOT_TYPE_CONTRACT_GRID_COINM", C52761wXj.TaskDescription.DcMfJKDGTeJD, C33070mpX.AYXKKw(C48033uCm.Fragment.invokespecialDaTmkG), C33070mpX.AYXKKw(C48033uCm.Fragment.iqMDAV), null, null, null, C56402yEa.EZpvd(new CategoryTag(C33070mpX.AYXKKw(C48033uCm.Fragment.QVsKAR), "", null, 4, null)), false, C52761wXj.Activity.DCUTEIddSDPG, WalletImportError.ERROR_CODE_AA_EXIST, null));
        }
        return arrayList;
    }

    public final BotSelectedData AEQbTJ(OrderCategory orderCategory) {
        String strAYXKKw;
        C51469vnc c51469vncConvertSelectBotConfig$default = C51468vnb.convertSelectBotConfig$default(orderCategory.getStrategyType(), false, 2, null);
        if (c51469vncConvertSelectBotConfig$default == null) {
            return null;
        }
        String strategyType = orderCategory.getStrategyType();
        int iCopydefault = c51469vncConvertSelectBotConfig$default.copydefault();
        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(orderCategory.getStrategyType());
        if (tacticsTypeAEQbTJ == null || (strAYXKKw = C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName())) == null) {
            strAYXKKw = "";
        }
        return new BotSelectedData(strategyType, iCopydefault, strAYXKKw, c51469vncConvertSelectBotConfig$default.AEQbTJ(), null, Boolean.FALSE, null, orderCategory.getTags(), false, C52761wXj.Activity.DCUTEIddSDPG, 64, null);
    }

    public final List<C51938vwU> copydefault() {
        ArrayList arrayList = new ArrayList();
        for (CategoryItem categoryItem : OLrzqt().getExtra()) {
            arrayList.add(OLrzqt(OLrzqt().getName(), categoryItem.getName(), categoryItem.getContent()));
        }
        return arrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }

    private final C51938vwU OLrzqt(String str, String str2, List<String> list) {
        String strAYXKKw;
        List listAhwBna;
        xOR xorCopydefault;
        List<OrderCategory> listAEQbTJ;
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : list) {
            String str3 = (String) obj;
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            if (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null || (listAEQbTJ = xorCopydefault.AEQbTJ()) == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                listAhwBna = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                Iterator<T> it = listAEQbTJ.iterator();
                while (it.hasNext()) {
                    listAhwBna.add(((OrderCategory) it.next()).getStrategyType());
                }
            }
            if (listAhwBna.contains(str3)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str4 : arrayList) {
            C51484vnr c51484vnr = null;
            C51469vnc c51469vncConvertSelectBotConfig$default = C51468vnb.convertSelectBotConfig$default(str4, false, 2, null);
            if (c51469vncConvertSelectBotConfig$default != null) {
                int iCopydefault = c51469vncConvertSelectBotConfig$default.copydefault();
                TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(str4);
                if (tacticsTypeAEQbTJ == null || (strAYXKKw = C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName())) == null) {
                    strAYXKKw = "";
                }
                c51484vnr = new C51484vnr(str, str4, iCopydefault, strAYXKKw);
            }
            if (c51484vnr != null) {
                arrayList2.add(c51484vnr);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (hashSet.add(((C51484vnr) obj2).AEQbTJ())) {
                arrayList3.add(obj2);
            }
        }
        return new C51938vwU(str2, arrayList3);
    }
}
