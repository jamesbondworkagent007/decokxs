package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.bean.EventParam;
import com.okinc.dapp.bean.DappChains;
import com.okinc.uilab.list.OKAnchorSelection;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dtJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14851dtJ extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public OKAnchorSelection AEQbTJ;
    public java.lang.Long AYXKKw;
    public boolean KWHzl;
    public java.util.List<DappChains> copydefault;
    public Function2<? super C14846dtE, ? super java.lang.Integer, Unit> djBIcL;
    public java.util.List<C14846dtE> OLrzqt = new java.util.ArrayList();
    public java.lang.String gEmmrt = "";

    private final boolean AEQbTJ(char c) {
        return ('a' <= c && c < '{') || ('A' <= c && c < '[');
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    /* JADX INFO: renamed from: o.dtJ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dtJ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.dtJ$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C14851dtJ newInstance$default(Activity activity, java.lang.Long l, Function2 function2, java.util.ArrayList arrayList, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = null;
            }
            if ((i & 2) != 0) {
                function2 = null;
            }
            if ((i & 4) != 0) {
                arrayList = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return activity.EZpvd(l, function2, arrayList, z);
        }

        public final C14851dtJ EZpvd(java.lang.Long l, Function2<? super C14846dtE, ? super java.lang.Integer, Unit> function2, java.util.ArrayList<DappChains> arrayList, boolean z) {
            C14851dtJ c14851dtJ = new C14851dtJ();
            android.os.Bundle bundle = new android.os.Bundle();
            if (l != null) {
                bundle.putLong("selectChainId", l.longValue());
            }
            bundle.putParcelableArrayList("chain_list", arrayList);
            bundle.putBoolean("is_show_all", z);
            c14851dtJ.setArguments(bundle);
            c14851dtJ.djBIcL = function2;
            return c14851dtJ;
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.AYXKKw().setText(getString(dLX.Dialog.gHZMYf));
        wxq.setStyle(2);
        wxq.setDividerVisibility(false);
    }

    /* JADX INFO: renamed from: o.dtJ$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(((C14846dtE) t).copydefault(), true);
            java.lang.String strDjBIcL = interfaceC9731bbCEZpvd != null ? interfaceC9731bbCEZpvd.djBIcL() : null;
            InterfaceC9731bbC interfaceC9731bbCEZpvd2 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(((C14846dtE) t2).copydefault(), true);
            return yET.KWHzl(strDjBIcL, interfaceC9731bbCEZpvd2 != null ? interfaceC9731bbCEZpvd2.djBIcL() : null);
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        C55173xeu c55173xeuCopydefault;
        C55230xfy c55230xfyDjBIcL;
        android.widget.EditText editTextEZpvd;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        android.view.View viewInflate = getCustomLayoutInflater().cloneInContext(new android.view.ContextThemeWrapper(getContext(), dLX.FragmentManager.AEQbTJ)).inflate(dLX.Fragment.AkhnZx, (android.view.ViewGroup) constraintLayout, true);
        android.os.Bundle arguments = getArguments();
        this.AYXKKw = arguments != null ? java.lang.Long.valueOf(arguments.getLong("selectChainId")) : null;
        android.os.Bundle arguments2 = getArguments();
        this.copydefault = arguments2 != null ? arguments2.getParcelableArrayList("chain_list") : null;
        android.os.Bundle arguments3 = getArguments();
        this.KWHzl = arguments3 != null ? arguments3.getBoolean("is_show_all") : false;
        OKAnchorSelection oKAnchorSelection = (OKAnchorSelection) viewInflate.findViewById(dLX.Application.AkhnZx);
        this.AEQbTJ = oKAnchorSelection;
        if (oKAnchorSelection != null) {
            oKAnchorSelection.setBackground(C33070mpX.KWHzl(C52761wXj.Activity.GhqvEQ));
        }
        OKAnchorSelection oKAnchorSelection2 = this.AEQbTJ;
        if (oKAnchorSelection2 != null) {
            oKAnchorSelection2.setSuspensionTitleBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.GhqvEQ));
        }
        OKAnchorSelection oKAnchorSelection3 = this.AEQbTJ;
        if (oKAnchorSelection3 != null && (c55230xfyDjBIcL = oKAnchorSelection3.djBIcL()) != null && (editTextEZpvd = c55230xfyDjBIcL.EZpvd()) != null) {
            editTextEZpvd.setHint(C33070mpX.AYXKKw(dLX.Dialog.OuxcSI));
        }
        OKAnchorSelection oKAnchorSelection4 = this.AEQbTJ;
        if (oKAnchorSelection4 != null && (c55173xeuCopydefault = oKAnchorSelection4.copydefault()) != null) {
            c55173xeuCopydefault.setTitle(C33070mpX.AYXKKw(dLX.Dialog.ffGIBT));
        }
        java.util.List<DappChains> list = this.copydefault;
        if (list != null) {
            OLrzqt(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list), this.AYXKKw);
        }
        OKAnchorSelection oKAnchorSelection5 = this.AEQbTJ;
        if (oKAnchorSelection5 != null) {
            oKAnchorSelection5.setSearchResultCallback(new Function1() { // from class: o.dtK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14851dtJ.EZpvd(this.AEQbTJ, (java.lang.CharSequence) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(C14851dtJ c14851dtJ, java.lang.CharSequence charSequence) {
        java.lang.Object objM7377constructorimpl;
        c14851dtJ.gEmmrt = java.lang.String.valueOf(charSequence != null ? charSequence.toString() : null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            Result.Application application = Result.Companion;
            java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = strValueOf.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            Pattern patternCompile = Pattern.compile(lowerCase);
            for (C14846dtE c14846dtE : c14851dtJ.OLrzqt) {
                java.lang.String strEZpvd = C14923duc.EZpvd.EZpvd(c14846dtE.djBIcL());
                java.util.Locale locale2 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                java.lang.String lowerCase2 = strEZpvd.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                if (patternCompile.matcher(lowerCase2).find()) {
                    arrayList.add(c14846dtE);
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
        OKAnchorSelection oKAnchorSelection = c14851dtJ.AEQbTJ;
        if (oKAnchorSelection != null) {
            oKAnchorSelection.setSearchResultList(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) CollectionsKt___CollectionsKt.EZpvd(arrayList, new Application())));
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.Long l) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String strAYXKKw3;
        if (!this.OLrzqt.isEmpty()) {
            return;
        }
        for (InterfaceC9731bbC interfaceC9731bbC : ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().KWHzl(true)) {
            if (interfaceC9731bbC.fetchVPNInfo() == 1 || interfaceC9731bbC.fetchVPNInfo() == 66 || interfaceC9731bbC.fetchVPNInfo() == 56 || interfaceC9731bbC.fetchVPNInfo() == 137 || interfaceC9731bbC.fetchVPNInfo() == 43114 || interfaceC9731bbC.fetchVPNInfo() == 250 || interfaceC9731bbC.fetchVPNInfo() == 42161 || interfaceC9731bbC.fetchVPNInfo() == 10 || interfaceC9731bbC.fetchVPNInfo() == 25 || interfaceC9731bbC.fetchVPNInfo() == 8217 || interfaceC9731bbC.fetchVPNInfo() == 1313161554 || interfaceC9731bbC.fetchVPNInfo() == 1284 || interfaceC9731bbC.fetchVPNInfo() == 1285 || interfaceC9731bbC.fetchVPNInfo() == 1666600000 || interfaceC9731bbC.fetchVPNInfo() == 321 || interfaceC9731bbC.fetchVPNInfo() == 1088 || interfaceC9731bbC.fetchVPNInfo() == 288 || interfaceC9731bbC.fetchVPNInfo() == 100 || interfaceC9731bbC.fetchVPNInfo() == 10001 || interfaceC9731bbC.fetchVPNInfo() == 513100 || interfaceC9731bbC.fetchVPNInfo() == 1116) {
                this.OLrzqt.add(new C14846dtE(interfaceC9731bbC.djBIcL(), interfaceC9731bbC.AYXKKw(), false, interfaceC9731bbC.fetchVPNInfo(), 0, false, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
            }
        }
        java.util.List<C14846dtE> list = this.OLrzqt;
        InterfaceC9731bbC interfaceC9731bbCGEmmrt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().gEmmrt();
        java.lang.String strDjBIcL = interfaceC9731bbCGEmmrt != null ? interfaceC9731bbCGEmmrt.djBIcL() : null;
        java.lang.String str = strDjBIcL == null ? "" : strDjBIcL;
        InterfaceC9731bbC interfaceC9731bbCGEmmrt2 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().gEmmrt();
        java.lang.String str2 = (interfaceC9731bbCGEmmrt2 == null || (strAYXKKw3 = interfaceC9731bbCGEmmrt2.AYXKKw()) == null) ? "" : strAYXKKw3;
        InterfaceC9731bbC interfaceC9731bbCGEmmrt3 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().gEmmrt();
        list.add(new C14846dtE(str, str2, false, interfaceC9731bbCGEmmrt3 != null ? interfaceC9731bbCGEmmrt3.fetchVPNInfo() : 0L, 0, false, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        java.util.List<C14846dtE> list2 = this.OLrzqt;
        InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd();
        java.lang.String strDjBIcL2 = interfaceC9731bbCEZpvd != null ? interfaceC9731bbCEZpvd.djBIcL() : null;
        java.lang.String str3 = strDjBIcL2 == null ? "" : strDjBIcL2;
        InterfaceC9731bbC interfaceC9731bbCEZpvd2 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd();
        java.lang.String str4 = (interfaceC9731bbCEZpvd2 == null || (strAYXKKw2 = interfaceC9731bbCEZpvd2.AYXKKw()) == null) ? "" : strAYXKKw2;
        InterfaceC9731bbC interfaceC9731bbCEZpvd3 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd();
        list2.add(new C14846dtE(str3, str4, false, interfaceC9731bbCEZpvd3 != null ? interfaceC9731bbCEZpvd3.fetchVPNInfo() : 0L, 0, false, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        java.util.List<C14846dtE> list3 = this.OLrzqt;
        InterfaceC9731bbC interfaceC9731bbCOLrzqt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().OLrzqt();
        java.lang.String strDjBIcL3 = interfaceC9731bbCOLrzqt != null ? interfaceC9731bbCOLrzqt.djBIcL() : null;
        java.lang.String str5 = strDjBIcL3 == null ? "" : strDjBIcL3;
        InterfaceC9731bbC interfaceC9731bbCOLrzqt2 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().OLrzqt();
        java.lang.String str6 = (interfaceC9731bbCOLrzqt2 == null || (strAYXKKw = interfaceC9731bbCOLrzqt2.AYXKKw()) == null) ? "" : strAYXKKw;
        InterfaceC9731bbC interfaceC9731bbCOLrzqt3 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().OLrzqt();
        list3.add(new C14846dtE(str5, str6, false, interfaceC9731bbCOLrzqt3 != null ? interfaceC9731bbCOLrzqt3.fetchVPNInfo() : 0L, 0, false, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        InterfaceC9731bbC interfaceC9731bbCEZpvd4 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(784L, true);
        if (interfaceC9731bbCEZpvd4 != null) {
            this.OLrzqt.add(new C14846dtE(interfaceC9731bbCEZpvd4.djBIcL(), interfaceC9731bbCEZpvd4.AYXKKw(), false, interfaceC9731bbCEZpvd4.fetchVPNInfo(), 0, false, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        }
        for (C14846dtE c14846dtE : this.OLrzqt) {
            long jCopydefault = c14846dtE.copydefault();
            if (jCopydefault == 1) {
                c14846dtE.OLrzqt(1);
                c14846dtE.OLrzqt(true);
            } else if (jCopydefault == 66) {
                c14846dtE.OLrzqt(2);
                c14846dtE.OLrzqt(true);
            } else if (jCopydefault == 56) {
                c14846dtE.OLrzqt(3);
                c14846dtE.OLrzqt(true);
            } else if (jCopydefault == 137) {
                c14846dtE.OLrzqt(4);
                c14846dtE.OLrzqt(true);
            } else if (jCopydefault == 637) {
                c14846dtE.OLrzqt(5);
            } else if (jCopydefault == 42161) {
                c14846dtE.OLrzqt(6);
            } else if (jCopydefault == 1313161554) {
                c14846dtE.OLrzqt(7);
            } else if (jCopydefault == 43114) {
                c14846dtE.OLrzqt(8);
            } else if (jCopydefault == 288) {
                c14846dtE.OLrzqt(9);
            } else if (jCopydefault == 1116) {
                c14846dtE.OLrzqt(10);
            } else if (jCopydefault == 25) {
                c14846dtE.OLrzqt(11);
            } else if (jCopydefault == 10001) {
                c14846dtE.OLrzqt(12);
            } else if (jCopydefault == 513100) {
                c14846dtE.OLrzqt(13);
            } else if (jCopydefault == 250) {
                c14846dtE.OLrzqt(14);
            } else if (jCopydefault == 1666600000) {
                c14846dtE.OLrzqt(15);
            } else if (jCopydefault == 321) {
                c14846dtE.OLrzqt(16);
            } else if (jCopydefault == 8217) {
                c14846dtE.OLrzqt(17);
            } else if (jCopydefault == 1088) {
                c14846dtE.OLrzqt(18);
            } else if (jCopydefault == 1284) {
                c14846dtE.OLrzqt(19);
            } else if (jCopydefault == 1285) {
                c14846dtE.OLrzqt(20);
            } else if (jCopydefault == 10) {
                c14846dtE.OLrzqt(21);
            } else if (jCopydefault == 501) {
                c14846dtE.OLrzqt(22);
            } else if (jCopydefault == 195) {
                c14846dtE.OLrzqt(23);
            } else {
                if (jCopydefault == 100) {
                    c14846dtE.OLrzqt(24);
                } else {
                    c14846dtE.OLrzqt(100);
                }
                long jCopydefault2 = c14846dtE.copydefault();
                if (l != null && jCopydefault2 == l.longValue()) {
                    c14846dtE.copydefault(true);
                }
            }
            long jCopydefault22 = c14846dtE.copydefault();
            if (l != null) {
                c14846dtE.copydefault(true);
            }
        }
    }

    public final void OLrzqt(java.util.List<DappChains> list, java.lang.Long l) {
        java.util.List<InterfaceC55105xdf> listValueOf;
        java.util.List<InterfaceC55105xdf> listValueOf2;
        java.util.List<InterfaceC55105xdf> listValueOf3;
        java.lang.Object next;
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
            DappChains dappChains = (DappChains) obj;
            InterfaceC9731bbC interfaceC9731bbCEZpvd = interfaceC9737bbICopydefault.EZpvd(dappChains.getChainId(), true);
            if (interfaceC9731bbCEZpvd != null) {
                this.OLrzqt.add(new C14846dtE(interfaceC9731bbCEZpvd.djBIcL(), interfaceC9731bbCEZpvd.AYXKKw(), l != null && interfaceC9731bbCEZpvd.fetchVPNInfo() == l.longValue(), dappChains.getChainId(), i2, dappChains.getHotFlag(), null, 64, null));
            }
            i = i2;
        }
        if (!this.KWHzl) {
            java.util.ArrayList<InterfaceC9731bbC> arrayListKWHzl = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).EZpvd().KWHzl();
            java.util.ArrayList<InterfaceC9731bbC> arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayListKWHzl) {
                InterfaceC9731bbC interfaceC9731bbC = (InterfaceC9731bbC) obj2;
                java.util.Iterator<T> it = this.OLrzqt.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((C14846dtE) next).copydefault() == interfaceC9731bbC.fetchVPNInfo()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (next == null) {
                    arrayList3.add(obj2);
                }
            }
            for (InterfaceC9731bbC interfaceC9731bbC2 : arrayList3) {
                this.OLrzqt.add(new C14846dtE(interfaceC9731bbC2.djBIcL(), interfaceC9731bbC2.AYXKKw(), l != null && interfaceC9731bbC2.fetchVPNInfo() == l.longValue(), interfaceC9731bbC2.fetchVPNInfo(), 0, false, null, 64, null));
            }
        }
        if (this.OLrzqt.isEmpty()) {
            AEQbTJ(this.AYXKKw);
        }
        for (C14846dtE c14846dtE : this.OLrzqt) {
            if (c14846dtE.EZpvd()) {
                arrayList.add(c14846dtE);
            }
            if (c14846dtE.djBIcL().length() > 1) {
                char cCharAt = c14846dtE.djBIcL().charAt(0);
                if (AEQbTJ(cCharAt)) {
                    char upperCase = java.lang.Character.toUpperCase(cCharAt);
                    java.util.List arrayList4 = (java.util.List) map.get(java.lang.Character.valueOf(upperCase));
                    if (arrayList4 == null) {
                        arrayList4 = new java.util.ArrayList();
                        map.put(java.lang.Character.valueOf(upperCase), arrayList4);
                    }
                    arrayList4.add(c14846dtE);
                }
            }
        }
        if (this.KWHzl) {
            arrayList2.add("");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(new C14846dtE(C33070mpX.AYXKKw(dLX.Dialog.htlTjW), "", l != null && l.longValue() == -1, -1L, 0, false, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
            OKAnchorSelection oKAnchorSelection = this.AEQbTJ;
            if (oKAnchorSelection != null && (listValueOf3 = oKAnchorSelection.valueOf()) != null) {
                listValueOf3.add(new C14847dtF(false, null, CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList5)));
            }
        }
        if (arrayList.size() > 0) {
            arrayList2.add("★");
            OLrzqt(arrayList);
            OKAnchorSelection oKAnchorSelection2 = this.AEQbTJ;
            if (oKAnchorSelection2 != null && (listValueOf2 = oKAnchorSelection2.valueOf()) != null) {
                listValueOf2.add(new C14847dtF(true, C33070mpX.AYXKKw(dLX.Dialog.OcIXYQ), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList)));
            }
        }
        for (char c = 'A'; c < '['; c = (char) (c + 1)) {
            java.util.List<C14846dtE> list2 = (java.util.List) map.get(java.lang.Character.valueOf(c));
            if (list2 != null) {
                arrayList2.add(java.lang.String.valueOf(c));
                OLrzqt(list2);
                OKAnchorSelection oKAnchorSelection3 = this.AEQbTJ;
                if (oKAnchorSelection3 != null && (listValueOf = oKAnchorSelection3.valueOf()) != null) {
                    listValueOf.add(new C14847dtF(true, java.lang.String.valueOf(c), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list2)));
                }
            }
        }
        OKAnchorSelection oKAnchorSelection4 = this.AEQbTJ;
        if (oKAnchorSelection4 != null) {
            oKAnchorSelection4.setIndexList(arrayList2);
        }
        OKAnchorSelection oKAnchorSelection5 = this.AEQbTJ;
        if (oKAnchorSelection5 != null) {
            java.util.List<InterfaceC55105xdf> listValueOf4 = oKAnchorSelection5.valueOf();
            if (listValueOf4 != null) {
                java.util.Iterator<T> it2 = listValueOf4.iterator();
                while (it2.hasNext()) {
                    oKAnchorSelection5.EZpvd((InterfaceC55105xdf) it2.next());
                }
            }
            oKAnchorSelection5.setConvertViewCallback(new Function2() { // from class: o.dtN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return C14851dtJ.KWHzl(this.copydefault, (C55043xcW) obj3, obj4);
                }
            });
        }
    }

    public static final Unit KWHzl(final C14851dtJ c14851dtJ, final C55043xcW c55043xcW, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        Intrinsics.copydefault(obj, "");
        final C14846dtE c14846dtE = (C14846dtE) obj;
        c55043xcW.EZpvd(dLX.Application.WS, C14923duc.EZpvd.EZpvd(c14846dtE.djBIcL()));
        if (c14846dtE.AEQbTJ()) {
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
        if (c14846dtE.copydefault() == -1) {
            android.widget.ImageView imageView3 = (android.widget.ImageView) c55043xcW.EZpvd(dLX.Application.giSNqX);
            if (imageView3 != null) {
                C33054mpH.OLrzqt(imageView3, java.lang.Integer.valueOf(C52761wXj.TaskDescription.createSocket));
            }
        } else {
            android.widget.ImageView imageView4 = (android.widget.ImageView) c55043xcW.EZpvd(dLX.Application.giSNqX);
            if (imageView4 != null) {
                C33054mpH.KWHzl(imageView4, c14846dtE.OLrzqt());
            }
        }
        c55043xcW.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.dtL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C14851dtJ.copydefault(c14846dtE, c14851dtJ, c55043xcW, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void copydefault(C14846dtE c14846dtE, C14851dtJ c14851dtJ, C55043xcW c55043xcW, android.view.View view) {
        C32866mlf.EZpvd("app_metax_discover_browser_network_click", new EventParam("chainname", c14846dtE.djBIcL(), false));
        java.lang.Long l = c14851dtJ.AYXKKw;
        long jCopydefault = c14846dtE.copydefault();
        if (l != null && l.longValue() == jCopydefault) {
            FragmentActivity activity = c14851dtJ.getActivity();
            C33134mqi.AEQbTJ(activity != null ? C33069mpW.KWHzl(activity, dLX.Dialog.spnCvw, C56424yEw.AYXKKw(C56390yDp.OLrzqt("network", C14923duc.EZpvd.EZpvd(c14846dtE.djBIcL())))) : null);
            return;
        }
        C14742drG.KWHzl.KWHzl(c14846dtE.djBIcL());
        c14846dtE.copydefault(c14851dtJ.gEmmrt);
        Function2<? super C14846dtE, ? super java.lang.Integer, Unit> function2 = c14851dtJ.djBIcL;
        if (function2 != null) {
            function2.invoke(c14846dtE, java.lang.Integer.valueOf(c55043xcW.getPosition()));
        }
        c14851dtJ.dismiss();
    }

    public static final int AEQbTJ(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
    }

    public final void OLrzqt(java.util.List<C14846dtE> list) {
        final Function2 function2 = new Function2() { // from class: o.dtM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Integer.valueOf(C14851dtJ.OLrzqt((C14846dtE) obj, (C14846dtE) obj2));
            }
        };
        C56407yEf.copydefault(list, new java.util.Comparator() { // from class: o.dtP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return C14851dtJ.AEQbTJ(function2, obj, obj2);
            }
        });
    }

    public static final int OLrzqt(C14846dtE c14846dtE, C14846dtE c14846dtE2) {
        return c14846dtE.AhwBna() - c14846dtE2.AhwBna();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
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
