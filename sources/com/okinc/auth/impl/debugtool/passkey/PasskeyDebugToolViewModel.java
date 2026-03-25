package com.okinc.auth.impl.debugtool.passkey;

import android.os.Build;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.C32979mnm;
import o.C5900aFG;
import o.C5903aFJ;
import o.C5904aFK;
import o.C5937aFr;
import o.C5938aFs;
import o.C5939aFt;
import o.C5941aFv;
import o.InterfaceC5687aBF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyDebugToolViewModel extends AbstractC33073mpa {
    public final C5941aFv AEQbTJ;
    public final InterfaceC5687aBF AYXKKw;
    public final C5937aFr AhwBna;
    public final C5900aFG EZpvd;
    public final C5904aFK KWHzl;
    public final MutableLiveData<String> OLrzqt;
    public final C5903aFJ copydefault;
    public final C5939aFt djBIcL;
    public final C5938aFs gEmmrt;
    public final LiveData<String> valueOf;

    @yCM
    public PasskeyDebugToolViewModel(@NotNull InterfaceC5687aBF interfaceC5687aBF, @NotNull C5904aFK c5904aFK, @NotNull C5941aFv c5941aFv, @NotNull C5938aFs c5938aFs, @NotNull C5937aFr c5937aFr, @NotNull C5939aFt c5939aFt, @NotNull C5900aFG c5900aFG, @NotNull C5903aFJ c5903aFJ) {
        Intrinsics.checkNotNullParameter(interfaceC5687aBF, "");
        Intrinsics.checkNotNullParameter(c5904aFK, "");
        Intrinsics.checkNotNullParameter(c5941aFv, "");
        Intrinsics.checkNotNullParameter(c5938aFs, "");
        Intrinsics.checkNotNullParameter(c5937aFr, "");
        Intrinsics.checkNotNullParameter(c5939aFt, "");
        Intrinsics.checkNotNullParameter(c5900aFG, "");
        Intrinsics.checkNotNullParameter(c5903aFJ, "");
        this.AYXKKw = interfaceC5687aBF;
        this.KWHzl = c5904aFK;
        this.AEQbTJ = c5941aFv;
        this.gEmmrt = c5938aFs;
        this.AhwBna = c5937aFr;
        this.djBIcL = c5939aFt;
        this.EZpvd = c5900aFG;
        this.copydefault = c5903aFJ;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData;
        this.valueOf = mutableLiveData;
    }

    public final boolean KWHzl() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(C32979mnm.EZpvd.OLrzqt()) == 0;
    }

    public static /* synthetic */ Pair getAndroidVersionInfo$default(PasskeyDebugToolViewModel passkeyDebugToolViewModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Build.VERSION.SDK_INT;
        }
        return passkeyDebugToolViewModel.KWHzl(i);
    }

    public final Pair<String, String> KWHzl(int i) {
        String string;
        StringBuilder sb;
        String str;
        switch (i) {
            case 1:
                string = "Android 1.0";
                break;
            case 2:
                string = "Android 1.1";
                break;
            case 3:
                string = "Android 1.5 Cupcake";
                break;
            case 4:
                string = "Android 1.6 Donut";
                break;
            case 5:
                string = "Android 2.0 Eclair";
                break;
            case 6:
                string = "Android 2.0.1 Eclair";
                break;
            case 7:
                string = "Android 2.1 Eclair";
                break;
            case 8:
                string = "Android 2.2 Froyo";
                break;
            case 9:
                string = "Android 2.3 Gingerbread";
                break;
            case 10:
                string = "Android 2.3.3 Gingerbread";
                break;
            case 11:
                string = "Android 3.0 Honeycomb";
                break;
            case 12:
                string = "Android 3.1 Honeycomb";
                break;
            case 13:
                string = "Android 3.2 Honeycomb";
                break;
            case 14:
                string = "Android 4.0 Ice Cream Sandwich";
                break;
            case 15:
                string = "Android 4.0.3 Ice Cream Sandwich";
                break;
            case 16:
                string = "Android 4.1 Jelly Bean";
                break;
            case 17:
                string = "Android 4.2 Jelly Bean";
                break;
            case 18:
                string = "Android 4.3 Jelly Bean";
                break;
            case 19:
                string = "Android 4.4 KitKat";
                break;
            case 20:
                string = "Android 4.4W KitKat Wear";
                break;
            case 21:
                string = "Android 5.0 Lollipop";
                break;
            case 22:
                string = "Android 5.1 Lollipop";
                break;
            case 23:
                string = "Android 6.0 Marshmallow";
                break;
            case 24:
                string = "Android 7.0 Nougat";
                break;
            case 25:
                string = "Android 7.1 Nougat";
                break;
            case 26:
                string = "Android 8.0 Oreo";
                break;
            case 27:
                string = "Android 8.1 Oreo";
                break;
            case 28:
                string = "Android 9 Pie";
                break;
            case 29:
                string = "Android 10";
                break;
            case 30:
                string = "Android 11";
                break;
            case 31:
                string = "Android 12";
                break;
            case 32:
                string = "Android 12L";
                break;
            case 33:
                string = "Android 13";
                break;
            case 34:
                string = "Android 14";
                break;
            case 35:
                string = "Android 15";
                break;
            default:
                if (i > 35) {
                    sb = new StringBuilder();
                    sb.append("Android ");
                    sb.append(i - 19);
                    str = " (API ";
                } else {
                    sb = new StringBuilder();
                    str = "Unknown (API ";
                }
                sb.append(str);
                sb.append(i);
                sb.append(")");
                string = sb.toString();
                break;
        }
        return new Pair<>("API " + i, string);
    }
}
