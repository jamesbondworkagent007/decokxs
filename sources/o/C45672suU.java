package o;

import com.okinc.okex.lite.hero.data.model.ContentModel;
import com.okinc.okex.lite.hero.data.model.CtaModel;
import com.okinc.okex.lite.hero.data.model.HeroContent;
import com.okinc.okex.lite.hero.data.model.HeroCta;
import com.okinc.okex.lite.hero.data.model.HeroResponseModel;
import com.okinc.okex.lite.hero.data.model.HeroSection;
import com.okinc.okex.lite.hero.data.model.HeroTabBarItem;
import com.okinc.okex.lite.hero.data.model.TabBarItemModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.suU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45672suU {
    public static final HeroSection OLrzqt(@NotNull HeroResponseModel heroResponseModel) {
        Intrinsics.checkNotNullParameter(heroResponseModel, "");
        return new HeroSection(heroResponseModel.OLrzqt(), AEQbTJ(heroResponseModel.KWHzl()), KWHzl(heroResponseModel.EZpvd()));
    }

    public static final HeroContent AEQbTJ(@NotNull ContentModel contentModel) {
        Intrinsics.checkNotNullParameter(contentModel, "");
        java.lang.String strCopydefault = contentModel.copydefault();
        java.lang.String strCopydefault2 = contentModel.copydefault();
        java.lang.String strOLrzqt = contentModel.OLrzqt();
        java.lang.String strOLrzqt2 = contentModel.OLrzqt();
        boolean zValueOf = contentModel.valueOf();
        java.lang.String strAYXKKw = contentModel.AYXKKw();
        java.lang.String strAEQbTJ = contentModel.AEQbTJ();
        java.util.List<CtaModel> listKWHzl = contentModel.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            arrayList.add(copydefault((CtaModel) it.next()));
        }
        return new HeroContent(strCopydefault, strCopydefault2, strOLrzqt, strOLrzqt2, zValueOf, strAYXKKw, strAEQbTJ, arrayList);
    }

    public static final HeroCta copydefault(@NotNull CtaModel ctaModel) {
        Intrinsics.checkNotNullParameter(ctaModel, "");
        return new HeroCta(ctaModel.copydefault(), ctaModel.KWHzl(), ctaModel.EZpvd());
    }

    public static final HeroTabBarItem KWHzl(@NotNull TabBarItemModel tabBarItemModel) {
        Intrinsics.checkNotNullParameter(tabBarItemModel, "");
        return new HeroTabBarItem(tabBarItemModel.copydefault(), tabBarItemModel.KWHzl(), tabBarItemModel.KWHzl(), tabBarItemModel.OLrzqt(), tabBarItemModel.OLrzqt(), tabBarItemModel.AEQbTJ());
    }
}
