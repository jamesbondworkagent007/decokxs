package o;

import android.view.View;
import androidx.core.os.BundleKt;
import com.google.gson.Gson;
import com.okinc.im.bean.OrbitIMChatSearchResult;
import com.okinc.planet.biz_search.SearchSubPage;
import com.okinc.search.bean.SearchResultContentPo;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.tGK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tGW extends tGG<C46092tHn, C46254tNn> {

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SearchSubPage.values().length];
            try {
                iArr[SearchSubPage.ORBITER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SearchSubPage.FEED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchSubPage.GROUPS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchSubPage.CONTACTS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchSubPage.MESSAGES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC47825txS
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C46254tNn copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C46254tNn c46254tNnCopydefault = C46254tNn.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c46254tNnCopydefault, "");
        return c46254tNnCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/txV;)V */
    @Override // o.AbstractC47825txS
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C46254tNn c46254tNn, int i, @NotNull C46092tHn c46092tHn) {
        Intrinsics.checkNotNullParameter(c46254tNn, "");
        Intrinsics.checkNotNullParameter(c46092tHn, "");
        C52794wYp c52794wYp = c46254tNn.AEQbTJ;
        java.lang.String lowerCase = c46092tHn.copydefault().name().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        c52794wYp.setContentDescription("search_show_more_" + lowerCase);
        C52794wYp c52794wYp2 = c46254tNn.AEQbTJ;
        c52794wYp2.setOnClickListener(new Activity(c52794wYp2, 1000L, this, c46254tNn, c46092tHn));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ tGW KWHzl;
        public final /* synthetic */ C46254tNn OLrzqt;
        public final /* synthetic */ C46092tHn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, tGW tgw, C46254tNn c46254tNn, C46092tHn c46092tHn) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = tgw;
            this.OLrzqt = c46254tNn;
            this.copydefault = c46092tHn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C59534zip adapter = this.KWHzl.getAdapter();
                C46079tHa c46079tHa = adapter instanceof C46079tHa ? (C46079tHa) adapter : null;
                if (c46079tHa == null) {
                    return;
                }
                OrbitIMChatSearchResult orbitIMChatSearchResultAEQbTJ = c46079tHa.AEQbTJ();
                java.lang.String strKWHzl = c46079tHa.KWHzl();
                if (strKWHzl == null) {
                    strKWHzl = "";
                }
                android.content.Context context = this.OLrzqt.getRoot().getContext();
                int i = ActionBar.AEQbTJ[this.copydefault.copydefault().ordinal()];
                if (i == 1) {
                    tGK.ActionBar actionBar = tGK.Companion;
                    Intrinsics.copydefault(context);
                    actionBar.OLrzqt(context, C33129mqd.gEmmrt(c46079tHa.KWHzl()));
                    return;
                }
                if (i == 2) {
                    java.lang.String strGEmmrt = C33129mqd.gEmmrt(c46079tHa.KWHzl());
                    SearchResultContentPo searchResultContentPoCopydefault = c46079tHa.copydefault();
                    SearchResultContentPo searchResultContentPoCopy$default = searchResultContentPoCopydefault != null ? SearchResultContentPo.copy$default(searchResultContentPoCopydefault, null, null, null, 1, null) : null;
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) tGE.class);
                    intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt(JwtUtilsKt.DID_METHOD_KEY, strGEmmrt), C56390yDp.OLrzqt("pageSource", C33129mqd.gEmmrt(c46079tHa.OLrzqt())), C56390yDp.OLrzqt("content", new Gson().toJson(searchResultContentPoCopy$default))));
                    context.startActivity(intent);
                    return;
                }
                if (i == 3) {
                    InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                    if (interfaceC35180nqU == null || orbitIMChatSearchResultAEQbTJ == null) {
                        return;
                    }
                    Intrinsics.copydefault(context);
                    interfaceC35180nqU.copydefault(context, orbitIMChatSearchResultAEQbTJ.getGroupResults(), strKWHzl);
                    return;
                }
                if (i == 4) {
                    InterfaceC35180nqU interfaceC35180nqU2 = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                    if (interfaceC35180nqU2 == null || orbitIMChatSearchResultAEQbTJ == null) {
                        return;
                    }
                    Intrinsics.copydefault(context);
                    interfaceC35180nqU2.AEQbTJ(context, orbitIMChatSearchResultAEQbTJ.getContactAndConversationResults(), strKWHzl);
                    return;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC35180nqU interfaceC35180nqU3 = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                if (interfaceC35180nqU3 == null || orbitIMChatSearchResultAEQbTJ == null) {
                    return;
                }
                Intrinsics.copydefault(context);
                interfaceC35180nqU3.EZpvd(context, orbitIMChatSearchResultAEQbTJ.getMessageResults(), strKWHzl);
            }
        }
    }
}
