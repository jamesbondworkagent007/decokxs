package com.okinc.tradingbot.impl.market_place.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.biz.TacticsType;
import com.okinc.tradingbot.impl.market_place.home.create_bot.config.BotCategoryType;
import com.okinc.unify_trade.biz.CategoryItem;
import com.okinc.unify_trade.biz.MpCategory;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C51468vnb;
import o.C51469vnc;
import o.C51484vnr;
import o.C51938vwU;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class MarketPlaceCreateBotPresenter extends AbsPresenter {
    public int EZpvd;
    public MpCategory KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull MpCategory mpCategory) {
        Intrinsics.checkNotNullParameter(mpCategory, "");
        this.KWHzl = mpCategory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketPlaceCreateBotPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public final MpCategory copydefault() {
        MpCategory mpCategory = this.KWHzl;
        if (mpCategory != null) {
            return mpCategory;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final List<C51938vwU> AEQbTJ() {
        ArrayList arrayList = new ArrayList();
        if (!copydefault().getDefaultContent().isEmpty()) {
            arrayList.add(buildCategoryCard$default(this, copydefault().getName(), null, copydefault().getDefaultContent(), 2, null));
        }
        for (CategoryItem categoryItem : copydefault().getExtra()) {
            arrayList.add(AEQbTJ(copydefault().getName(), BotCategoryType.Companion.EZpvd(categoryItem.getName()), categoryItem.getContent()));
        }
        return arrayList;
    }

    public static /* synthetic */ C51938vwU buildCategoryCard$default(MarketPlaceCreateBotPresenter marketPlaceCreateBotPresenter, String str, String str2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return marketPlaceCreateBotPresenter.AEQbTJ(str, str2, list);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }

    public final C51938vwU AEQbTJ(String str, String str2, List<String> list) {
        String strAYXKKw;
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : list) {
            if (TacticsType.Companion.EZpvd().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str3 : arrayList) {
            C51484vnr c51484vnr = null;
            C51469vnc c51469vncConvertSelectBotConfig$default = C51468vnb.convertSelectBotConfig$default(str3, false, 2, null);
            if (c51469vncConvertSelectBotConfig$default != null) {
                int iCopydefault = c51469vncConvertSelectBotConfig$default.copydefault();
                TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(str3);
                if (tacticsTypeAEQbTJ == null || (strAYXKKw = C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName())) == null) {
                    strAYXKKw = "";
                }
                c51484vnr = new C51484vnr(str, str3, iCopydefault, strAYXKKw);
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
