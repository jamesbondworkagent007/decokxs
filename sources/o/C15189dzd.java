package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.bean.EventParam;
import com.okinc.dapp.bean.SelectWalletNet;
import com.okinc.uilab.list.OKAnchorSelection;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.dLX;
import o.xWD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dzd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15189dzd extends wXX {
    public Function2<? super C15116dyJ, ? super java.lang.Integer, Unit> AYXKKw;
    public dMC AhwBna;
    public java.util.List<SelectWalletNet> KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public java.lang.Long gEmmrt;
    public java.lang.String isConnected;
    public boolean valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public float EZpvd = 0.95f;
    public java.util.List<C15116dyJ> djBIcL = new java.util.ArrayList();

    private final boolean EZpvd(char c) {
        return ('a' <= c && c < '{') || ('A' <= c && c < '[');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.dzd$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dzd.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.dzd$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C15189dzd newInstance$default(Activity activity, java.lang.Long l, java.util.ArrayList arrayList, Function2 function2, java.lang.String str, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = null;
            }
            if ((i & 2) != 0) {
                arrayList = null;
            }
            if ((i & 4) != 0) {
                function2 = null;
            }
            if ((i & 8) != 0) {
                str = "";
            }
            if ((i & 16) != 0) {
                z = false;
            }
            if ((i & 32) != 0) {
                z2 = false;
            }
            if ((i & 64) != 0) {
                z3 = false;
            }
            return activity.copydefault(l, arrayList, function2, str, z, z2, z3);
        }

        public final C15189dzd copydefault(java.lang.Long l, java.util.ArrayList<SelectWalletNet> arrayList, Function2<? super C15116dyJ, ? super java.lang.Integer, Unit> function2, java.lang.String str, boolean z, boolean z2, boolean z3) {
            C15189dzd c15189dzd = new C15189dzd();
            android.os.Bundle bundle = new android.os.Bundle();
            if (l != null) {
                bundle.putLong("selectChainId", l.longValue());
            }
            bundle.putParcelableArrayList("chain_list", arrayList);
            bundle.putBoolean("is_show_all", z3);
            bundle.putBoolean("isDarkMode", z);
            bundle.putString("title", str);
            bundle.putBoolean("showSearchNetwork", z2);
            c15189dzd.setArguments(bundle);
            c15189dzd.AYXKKw = function2;
            return c15189dzd;
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        wYC wyc;
        OKAnchorSelection oKAnchorSelection;
        OKAnchorSelection oKAnchorSelection2;
        OKAnchorSelection oKAnchorSelection3;
        C55230xfy c55230xfyDjBIcL;
        OKAnchorSelection oKAnchorSelection4;
        C55173xeu c55173xeuCopydefault;
        OKAnchorSelection oKAnchorSelection5;
        C55230xfy c55230xfyDjBIcL2;
        android.widget.EditText editTextEZpvd;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            android.os.Bundle arguments2 = getArguments();
            this.gEmmrt = arguments2 != null ? java.lang.Long.valueOf(arguments2.getLong("selectChainId")) : null;
            android.os.Bundle arguments3 = getArguments();
            this.KWHzl = arguments3 != null ? arguments3.getParcelableArrayList("chain_list") : null;
            android.os.Bundle arguments4 = getArguments();
            this.copydefault = arguments4 != null ? arguments4.getBoolean("is_show_all") : false;
            java.lang.String string = arguments.getString("title");
            java.lang.String string2 = getString(dLX.Dialog.gHZMYf);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (string == null || string.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
                string = string2;
            }
            this.isConnected = string;
            this.OLrzqt = arguments.getBoolean("isDarkMode");
            this.valueOf = arguments.getBoolean("showSearchNetwork");
        }
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(getContext(), dLX.FragmentManager.AEQbTJ);
        dMC dmcKWHzl = dMC.KWHzl(getLayoutInflater().cloneInContext(contextThemeWrapper), constraintLayout, true);
        this.AhwBna = dmcKWHzl;
        if (dmcKWHzl != null && (oKAnchorSelection5 = dmcKWHzl.copydefault) != null && (c55230xfyDjBIcL2 = oKAnchorSelection5.djBIcL()) != null && (editTextEZpvd = c55230xfyDjBIcL2.EZpvd()) != null) {
            editTextEZpvd.setHint(C33070mpX.AYXKKw(dLX.Dialog.OuxcSI));
        }
        dMC dmc = this.AhwBna;
        if (dmc != null && (oKAnchorSelection4 = dmc.copydefault) != null && (c55173xeuCopydefault = oKAnchorSelection4.copydefault()) != null) {
            c55173xeuCopydefault.setTitle(C33070mpX.AYXKKw(dLX.Dialog.ffGIBT));
        }
        java.util.List<SelectWalletNet> list = this.KWHzl;
        if (list != null) {
            AEQbTJ(list, this.gEmmrt);
        }
        dMC dmc2 = this.AhwBna;
        if (dmc2 != null && (oKAnchorSelection3 = dmc2.copydefault) != null && (c55230xfyDjBIcL = oKAnchorSelection3.djBIcL()) != null) {
            c55230xfyDjBIcL.setVisibility(this.valueOf ? 0 : 8);
        }
        dMC dmc3 = this.AhwBna;
        if (dmc3 != null && (oKAnchorSelection2 = dmc3.copydefault) != null) {
            C15196dzk c15196dzk = C15196dzk.KWHzl;
            android.content.Context context = oKAnchorSelection2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.Integer numAEQbTJ = c15196dzk.AEQbTJ(context, dLX.TaskDescription.AEQbTJ);
            if (numAEQbTJ != null) {
                int iIntValue = numAEQbTJ.intValue();
                oKAnchorSelection2.setBackground(contextThemeWrapper.getDrawable(iIntValue));
                oKAnchorSelection2.setSuspensionTitleBackgroundColor(contextThemeWrapper.getColor(iIntValue));
            }
        }
        dMC dmc4 = this.AhwBna;
        if (dmc4 != null && (oKAnchorSelection = dmc4.copydefault) != null) {
            oKAnchorSelection.setSearchResultCallback(new Function1() { // from class: o.dzf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15189dzd.KWHzl(this.AEQbTJ, (java.lang.CharSequence) obj);
                }
            });
        }
        dMC dmc5 = this.AhwBna;
        if (dmc5 == null || (wyc = dmc5.OLrzqt) == null) {
            return;
        }
        wyc.setOnClickListener(new View.OnClickListener() { // from class: o.dzh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C15189dzd.OLrzqt(this.AEQbTJ, view);
            }
        });
    }

    public static final Unit KWHzl(C15189dzd c15189dzd, java.lang.CharSequence charSequence) {
        java.lang.Object objM7377constructorimpl;
        OKAnchorSelection oKAnchorSelection;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            Result.Application application = Result.Companion;
            java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = strValueOf.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            Pattern patternCompile = Pattern.compile(lowerCase);
            for (C15116dyJ c15116dyJ : c15189dzd.djBIcL) {
                java.lang.String strEZpvd = C14923duc.EZpvd.EZpvd(c15116dyJ.AhwBna());
                java.util.Locale locale2 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                java.lang.String lowerCase2 = strEZpvd.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                if (patternCompile.matcher(lowerCase2).find()) {
                    arrayList.add(c15116dyJ);
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            try {
                Result.Application application3 = Result.Companion;
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th2) {
                Result.Application application4 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
        }
        dMC dmc = c15189dzd.AhwBna;
        if (dmc != null && (oKAnchorSelection = dmc.copydefault) != null) {
            oKAnchorSelection.setSearchResultList(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList));
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C15189dzd c15189dzd, android.view.View view) {
        c15189dzd.dismiss();
    }

    private final void AEQbTJ(java.util.List<SelectWalletNet> list, java.lang.Long l) {
        OKAnchorSelection oKAnchorSelection;
        OKAnchorSelection oKAnchorSelection2;
        OKAnchorSelection oKAnchorSelection3;
        java.util.List<InterfaceC55105xdf> listValueOf;
        OKAnchorSelection oKAnchorSelection4;
        java.util.List<InterfaceC55105xdf> listValueOf2;
        OKAnchorSelection oKAnchorSelection5;
        java.util.List<InterfaceC55105xdf> listValueOf3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        InterfaceC9737bbI interfaceC9737bbICopydefault = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault();
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            SelectWalletNet selectWalletNet = (SelectWalletNet) obj;
            InterfaceC9731bbC interfaceC9731bbCEZpvd = interfaceC9737bbICopydefault.EZpvd(selectWalletNet.getChainId(), true);
            if (interfaceC9731bbCEZpvd != null) {
                this.djBIcL.add(new C15116dyJ(interfaceC9731bbCEZpvd.djBIcL(), interfaceC9731bbCEZpvd.AYXKKw(), l != null && interfaceC9731bbCEZpvd.fetchVPNInfo() == l.longValue(), selectWalletNet.getChainId(), i2, selectWalletNet.getHot()));
            }
            i = i2;
        }
        for (C15116dyJ c15116dyJ : this.djBIcL) {
            if (c15116dyJ.copydefault()) {
                arrayList.add(c15116dyJ);
            }
            if (c15116dyJ.AhwBna().length() > 1) {
                char cCharAt = c15116dyJ.AhwBna().charAt(0);
                if (EZpvd(cCharAt)) {
                    char upperCase = java.lang.Character.toUpperCase(cCharAt);
                    java.util.List arrayList3 = (java.util.List) map.get(java.lang.Character.valueOf(upperCase));
                    if (arrayList3 == null) {
                        arrayList3 = new java.util.ArrayList();
                        map.put(java.lang.Character.valueOf(upperCase), arrayList3);
                    }
                    arrayList3.add(c15116dyJ);
                }
            }
        }
        if (this.copydefault) {
            arrayList2.add("");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(new C15116dyJ(C33070mpX.AYXKKw(dLX.Dialog.htlTjW), "", l != null && l.longValue() == -1, -1L, 0, false, 48, null));
            dMC dmc = this.AhwBna;
            if (dmc != null && (oKAnchorSelection5 = dmc.copydefault) != null && (listValueOf3 = oKAnchorSelection5.valueOf()) != null) {
                listValueOf3.add(new C14847dtF(true, C33070mpX.AYXKKw(dLX.Dialog.htlTjW), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList4)));
            }
        }
        if (arrayList.size() > 0) {
            arrayList2.add("★");
            copydefault(arrayList);
            dMC dmc2 = this.AhwBna;
            if (dmc2 != null && (oKAnchorSelection4 = dmc2.copydefault) != null && (listValueOf2 = oKAnchorSelection4.valueOf()) != null) {
                listValueOf2.add(new C14847dtF(true, C33070mpX.AYXKKw(dLX.Dialog.OcIXYQ), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList)));
            }
        }
        for (char c = 'A'; c < '['; c = (char) (c + 1)) {
            java.util.List<C15116dyJ> list2 = (java.util.List) map.get(java.lang.Character.valueOf(c));
            if (list2 != null) {
                arrayList2.add(java.lang.String.valueOf(c));
                copydefault(list2);
                dMC dmc3 = this.AhwBna;
                if (dmc3 != null && (oKAnchorSelection3 = dmc3.copydefault) != null && (listValueOf = oKAnchorSelection3.valueOf()) != null) {
                    listValueOf.add(new C14847dtF(true, java.lang.String.valueOf(c), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list2)));
                }
            }
        }
        dMC dmc4 = this.AhwBna;
        if (dmc4 != null && (oKAnchorSelection2 = dmc4.copydefault) != null) {
            oKAnchorSelection2.setIndexList(arrayList2);
        }
        dMC dmc5 = this.AhwBna;
        if (dmc5 == null || (oKAnchorSelection = dmc5.copydefault) == null) {
            return;
        }
        java.util.List<InterfaceC55105xdf> listValueOf4 = oKAnchorSelection.valueOf();
        if (listValueOf4 != null) {
            java.util.Iterator<T> it = listValueOf4.iterator();
            while (it.hasNext()) {
                oKAnchorSelection.EZpvd((InterfaceC55105xdf) it.next());
            }
        }
        oKAnchorSelection.setConvertViewCallback(new Function2() { // from class: o.dzj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return C15189dzd.KWHzl(this.EZpvd, (C55043xcW) obj2, obj3);
            }
        });
    }

    public static final Unit KWHzl(final C15189dzd c15189dzd, final C55043xcW c55043xcW, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        Intrinsics.copydefault(obj, "");
        final C15116dyJ c15116dyJ = (C15116dyJ) obj;
        c55043xcW.EZpvd(dLX.Application.WS, C14923duc.EZpvd.EZpvd(c15116dyJ.AhwBna()));
        if (c15116dyJ.KWHzl()) {
            android.widget.ImageView imageView = (android.widget.ImageView) c55043xcW.EZpvd(dLX.Application.USBtdM);
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else {
            android.widget.ImageView imageView2 = (android.widget.ImageView) c55043xcW.EZpvd(dLX.Application.USBtdM);
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        android.widget.TextView textView = (android.widget.TextView) c55043xcW.EZpvd(dLX.Application.WS);
        if (textView != null) {
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
        }
        if (c15116dyJ.OLrzqt() == -1) {
            android.widget.ImageView imageView3 = (android.widget.ImageView) c55043xcW.EZpvd(dLX.Application.giSNqX);
            if (imageView3 != null) {
                C33054mpH.OLrzqt(imageView3, java.lang.Integer.valueOf(xWD.Activity.copydefault));
            }
        } else {
            android.widget.ImageView imageView4 = (android.widget.ImageView) c55043xcW.EZpvd(dLX.Application.giSNqX);
            if (imageView4 != null) {
                C33054mpH.KWHzl(imageView4, c15116dyJ.EZpvd());
            }
        }
        c55043xcW.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.dze
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C15189dzd.copydefault(c15116dyJ, c15189dzd, c55043xcW, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void copydefault(C15116dyJ c15116dyJ, C15189dzd c15189dzd, C55043xcW c55043xcW, android.view.View view) {
        C32866mlf.EZpvd("app_metax_discover_browser_network_click", new EventParam("chainname", c15116dyJ.AhwBna(), false));
        java.lang.Long l = c15189dzd.gEmmrt;
        long jOLrzqt = c15116dyJ.OLrzqt();
        if (l != null && l.longValue() == jOLrzqt) {
            FragmentActivity activity = c15189dzd.getActivity();
            C33134mqi.AEQbTJ(activity != null ? C33069mpW.KWHzl(activity, dLX.Dialog.spnCvw, C56424yEw.AYXKKw(C56390yDp.OLrzqt("network", C14923duc.EZpvd.EZpvd(c15116dyJ.AhwBna())))) : null);
        } else {
            Function2<? super C15116dyJ, ? super java.lang.Integer, Unit> function2 = c15189dzd.AYXKKw;
            if (function2 != null) {
                function2.invoke(c15116dyJ, java.lang.Integer.valueOf(c55043xcW.getPosition()));
            }
            c15189dzd.dismiss();
        }
    }

    public static final int OLrzqt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
    }

    private final void copydefault(java.util.List<C15116dyJ> list) {
        final Function2 function2 = new Function2() { // from class: o.dzm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Integer.valueOf(C15189dzd.OLrzqt((C15116dyJ) obj, (C15116dyJ) obj2));
            }
        };
        C56407yEf.copydefault(list, new java.util.Comparator() { // from class: o.dzl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return C15189dzd.OLrzqt(function2, obj, obj2);
            }
        });
    }

    public static final int OLrzqt(C15116dyJ c15116dyJ, C15116dyJ c15116dyJ2) {
        return c15116dyJ.AEQbTJ() - c15116dyJ2.AEQbTJ();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        try {
            if (isAdded()) {
                dismiss();
            } else {
                super.show(fragmentManager, str);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
