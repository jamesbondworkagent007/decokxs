package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.market.features.meme.filter.social.SocialMediaType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kfR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28683kfR extends AbstractC52792wYn {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public java.util.List<C55276xgr> EZpvd = yDY.AhwBna();

    /* JADX INFO: renamed from: o.kfR$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SocialMediaType.values().length];
            try {
                iArr[SocialMediaType.PUMP_LIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.kfR$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kfR.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kfR$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C28683kfR newInstance$default(ActionBar actionBar, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = yDY.AhwBna();
            }
            return actionBar.EZpvd(list);
        }

        public final C28683kfR EZpvd(@NotNull java.util.List<java.lang.String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C28683kfR c28683kfR = new C28683kfR();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putStringArrayList("selected_social_data", new java.util.ArrayList<>(list));
            c28683kfR.setArguments(bundle);
            return c28683kfR;
        }
    }

    public final java.util.List<java.lang.String> EZpvd() {
        java.util.ArrayList<java.lang.String> stringArrayList;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (stringArrayList = arguments.getStringArrayList("selected_social_data")) == null) ? yDY.AhwBna() : stringArrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    @Override // o.AbstractC52792wYn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        java.lang.String strAYXKKw;
        java.lang.Object objValueOf;
        C55118xds root;
        android.content.Context context;
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        SocialMediaType[] socialMediaTypeArrValues = SocialMediaType.values();
        java.util.ArrayList<C55276xgr> arrayList = new java.util.ArrayList(socialMediaTypeArrValues.length);
        for (SocialMediaType socialMediaType : socialMediaTypeArrValues) {
            if (TaskDescription.KWHzl[socialMediaType.ordinal()] == 1) {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.DGgkXd);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(socialMediaType.getLabelResId());
            }
            java.lang.String str = strAYXKKw;
            java.lang.String apiKey = socialMediaType.getApiKey();
            CDNSourceManager.Activity filterIconCdn = socialMediaType.getFilterIconCdn();
            if (filterIconCdn != null) {
                C54946xaf binding = getBinding();
                java.lang.String strOLrzqt = (binding == null || (root = binding.getRoot()) == null || (context = root.getContext()) == null) ? null : CDNSourceManager.EZpvd.OLrzqt(filterIconCdn, context);
                if (strOLrzqt != null) {
                    objValueOf = strOLrzqt;
                }
            } else {
                objValueOf = java.lang.Integer.valueOf(socialMediaType.getIconResId());
            }
            arrayList.add(new C55276xgr(str, apiKey, null, false, false, objValueOf, null, 92, null));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (C55276xgr c55276xgr : arrayList) {
            arrayList2.add(C55276xgr.copy$default(c55276xgr, null, null, null, CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Object>) EZpvd(), c55276xgr.OLrzqt()), false, null, null, 119, null));
        }
        c55198xfS.setMultipleOneColumnData(arrayList2, new Function1() { // from class: o.kfW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28683kfR.AEQbTJ(this.KWHzl, (java.util.List) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C28683kfR c28683kfR, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c28683kfR.EZpvd = list;
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(2);
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        java.lang.String string = wxq.getContext().getString(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplApi191);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
        super.onCreateHeader(wxq);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setPrimaryText(wyf.getContext().getString(C23274hvD.Fragment.dpErvT));
        wyf.setSecondaryText(wyf.getContext().getString(C23274hvD.Fragment.hDKMBd));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.kfP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C28683kfR.KWHzl(this.OLrzqt, view);
                }
            });
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.kfS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C28683kfR.EZpvd(this.KWHzl, view);
                }
            });
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOKDSType(260);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: androidx.fragment.app.Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C28683kfR c28683kfR, android.view.View view) {
        java.util.List<C55276xgr> list = c28683kfR.EZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object objOLrzqt = ((C55276xgr) it.next()).OLrzqt();
            java.lang.String str = objOLrzqt instanceof java.lang.String ? (java.lang.String) objOLrzqt : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        androidx.fragment.app.Fragment parentFragment = c28683kfR.getParentFragment();
        InterfaceC28689kfX interfaceC28689kfX = parentFragment instanceof InterfaceC28689kfX ? (InterfaceC28689kfX) parentFragment : null;
        if (interfaceC28689kfX != null) {
            interfaceC28689kfX.KWHzl(arrayList);
        }
        c28683kfR.dismissAllowingStateLoss();
    }

    public static final void EZpvd(C28683kfR c28683kfR, android.view.View view) {
        ActivityResultCaller parentFragment = c28683kfR.getParentFragment();
        InterfaceC28689kfX interfaceC28689kfX = parentFragment instanceof InterfaceC28689kfX ? (InterfaceC28689kfX) parentFragment : null;
        if (interfaceC28689kfX != null) {
            interfaceC28689kfX.KWHzl(yDY.AhwBna());
        }
        c28683kfR.dismissAllowingStateLoss();
    }
}
