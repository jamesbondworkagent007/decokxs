package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.uBU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class kFE {
    public static final Activity Companion = new Activity(null);
    public static volatile boolean KWHzl = false;

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kFE.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final boolean AEQbTJ() {
            return kFE.KWHzl;
        }

        public final void KWHzl(boolean z) {
            kFE.KWHzl = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [34=10] */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final androidx.fragment.app.Fragment EZpvd(@NotNull pWN pwn) {
            androidx.fragment.app.Fragment c27857kFx;
            Intrinsics.checkNotNullParameter(pwn, "");
            java.lang.String strAEQbTJ = pwn.AEQbTJ();
            switch (strAEQbTJ.hashCode()) {
                case -1956807563:
                    c27857kFx = !strAEQbTJ.equals("OPTION") ? new C27857kFx() : new kHL();
                    break;
                case -1463930849:
                    if (strAEQbTJ.equals("market_tab_derivatives")) {
                        c27857kFx = new C27857kFx();
                        break;
                    }
                    break;
                case 2044812:
                    if (strAEQbTJ.equals("BOTS")) {
                        c27857kFx = KWHzl();
                        break;
                    }
                    break;
                case 2074257:
                    if (strAEQbTJ.equals("COIN")) {
                        c27857kFx = new kGW();
                        break;
                    }
                    break;
                case 2552066:
                    if (strAEQbTJ.equals("SPOT")) {
                        c27857kFx = new C27919kIe();
                        break;
                    }
                    break;
                case 2558355:
                    if (strAEQbTJ.equals("SWAP")) {
                        c27857kFx = new kHU();
                        break;
                    }
                    break;
                case 214415088:
                    if (strAEQbTJ.equals("FUTURES")) {
                        c27857kFx = new kHU();
                        break;
                    }
                    break;
                case 1724028365:
                    if (strAEQbTJ.equals("Watchlist")) {
                        c27857kFx = !C27563jxZ.OLrzqt.KWHzl() ? new kIY() : new kKI();
                        break;
                    }
                    break;
                case 2022478611:
                    if (strAEQbTJ.equals("discover_community")) {
                        c27857kFx = OLrzqt();
                        break;
                    }
                    break;
                case 2088923815:
                    if (strAEQbTJ.equals("COIN_FIND")) {
                        c27857kFx = copydefault();
                        break;
                    }
                    break;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("inst_type", pwn.AEQbTJ());
            c27857kFx.setArguments(bundle);
            return c27857kFx;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.uBU.ActionBar.getMarketPlaceFragment$default(o.uBU, boolean, boolean, android.os.Bundle, boolean, int, java.lang.Object):o.moC */
        public final androidx.fragment.app.Fragment KWHzl() {
            return uBU.ActionBar.getMarketPlaceFragment$default((uBU) C43251rlk.copydefault(uBU.class), false, false, null, false, 14, null);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void AEQbTJ(@NotNull java.util.ArrayList<pWN> arrayList, @NotNull java.util.ArrayList<java.lang.Long> arrayList2) {
            long j;
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            arrayList2.clear();
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String strAEQbTJ = ((pWN) it.next()).AEQbTJ();
                switch (strAEQbTJ.hashCode()) {
                    case -1956807563:
                        j = !strAEQbTJ.equals("OPTION") ? 1300L : 600L;
                        break;
                    case -1463930849:
                        if (strAEQbTJ.equals("market_tab_derivatives")) {
                            j = 800;
                            break;
                        }
                        break;
                    case -1349992894:
                        if (strAEQbTJ.equals("COIN_FIND_DATA")) {
                            j = 900;
                            break;
                        }
                        break;
                    case 2044812:
                        strAEQbTJ.equals("BOTS");
                        break;
                    case 2074257:
                        if (strAEQbTJ.equals("COIN")) {
                            j = 200;
                            break;
                        }
                        break;
                    case 2552066:
                        if (strAEQbTJ.equals("SPOT")) {
                            j = 300;
                            break;
                        }
                        break;
                    case 2558355:
                        if (strAEQbTJ.equals("SWAP")) {
                            j = 400;
                            break;
                        }
                        break;
                    case 69808306:
                        if (strAEQbTJ.equals("INDEX")) {
                            j = 700;
                            break;
                        }
                        break;
                    case 214415088:
                        if (strAEQbTJ.equals("FUTURES")) {
                            j = 500;
                            break;
                        }
                        break;
                    case 1047194156:
                        if (strAEQbTJ.equals("CR_Market")) {
                            j = 1400;
                            break;
                        }
                        break;
                    case 1272578020:
                        if (strAEQbTJ.equals("CHANCE_FIND")) {
                            j = 1200;
                            break;
                        }
                        break;
                    case 1724028365:
                        if (strAEQbTJ.equals("Watchlist")) {
                            j = 100;
                            break;
                        }
                        break;
                    case 2022478611:
                        if (strAEQbTJ.equals("discover_community")) {
                            j = 1100;
                            break;
                        }
                        break;
                    case 2088923815:
                        if (strAEQbTJ.equals("COIN_FIND")) {
                            j = 1000;
                            break;
                        }
                        break;
                }
                arrayList2.add(java.lang.Long.valueOf(j));
            }
        }

        public final androidx.fragment.app.Fragment copydefault() {
            return ((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).OLrzqt();
        }

        public final androidx.fragment.app.Fragment OLrzqt() {
            androidx.fragment.app.Fragment fragmentEZpvd;
            InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.OLrzqt(InterfaceC49317umK.class);
            return (interfaceC49317umK == null || (fragmentEZpvd = interfaceC49317umK.EZpvd()) == null) ? new C27857kFx() : fragmentEZpvd;
        }

        public static /* synthetic */ androidx.fragment.app.Fragment getFragmentByFirstGroupDataCR$default(Activity activity, pWN pwn, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return activity.copydefault(pwn, z);
        }

        public final androidx.fragment.app.Fragment copydefault(@NotNull pWN pwn, boolean z) {
            Intrinsics.checkNotNullParameter(pwn, "");
            java.lang.String strAEQbTJ = pwn.AEQbTJ();
            int iHashCode = strAEQbTJ.hashCode();
            if (iHashCode != -1463930849) {
                if (iHashCode != 2552066) {
                    if (iHashCode == 1724028365 && strAEQbTJ.equals("Watchlist")) {
                        return new C27923kIi();
                    }
                } else if (strAEQbTJ.equals("SPOT")) {
                    return z ? new C27902kHo() : new C27919kIe();
                }
            } else if (strAEQbTJ.equals("market_tab_derivatives")) {
                return new kEW();
            }
            return EZpvd(pwn);
        }
    }
}
