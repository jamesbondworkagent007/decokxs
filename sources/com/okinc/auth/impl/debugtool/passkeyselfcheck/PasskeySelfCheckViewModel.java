package com.okinc.auth.impl.debugtool.passkeyselfcheck;

import android.os.Build;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.AbstractC33073mpa;
import o.C32979mnm;
import o.C5725aBr;
import o.C5900aFG;
import o.C5903aFJ;
import o.C5904aFK;
import o.C5937aFr;
import o.C5938aFs;
import o.C5939aFt;
import o.C5941aFv;
import o.InterfaceC47278tmy;
import o.InterfaceC5687aBF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeySelfCheckViewModel extends AbstractC33073mpa {
    public final C5900aFG AEQbTJ;
    public final C5937aFr AYXKKw;
    public final C5939aFt AhwBna;
    public final InterfaceC47278tmy AkhnZx;
    public final C5941aFv EZpvd;
    public final MutableLiveData<Boolean> KWHzl;
    public final C5904aFK OLrzqt;
    public final MutableLiveData<C5725aBr> copydefault;
    public final C5938aFs djBIcL;
    public final InterfaceC5687aBF gEmmrt;
    public final LiveData<C5725aBr> isConnected;
    public final C5903aFJ valueOf;
    public final LiveData<Boolean> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C5725aBr> OLrzqt() {
        return this.isConnected;
    }

    @yCM
    public PasskeySelfCheckViewModel(@NotNull C5941aFv c5941aFv, @NotNull C5904aFK c5904aFK, @NotNull InterfaceC5687aBF interfaceC5687aBF, @NotNull C5938aFs c5938aFs, @NotNull C5900aFG c5900aFG, @NotNull C5903aFJ c5903aFJ, @NotNull C5939aFt c5939aFt, @NotNull C5937aFr c5937aFr, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(c5941aFv, "");
        Intrinsics.checkNotNullParameter(c5904aFK, "");
        Intrinsics.checkNotNullParameter(interfaceC5687aBF, "");
        Intrinsics.checkNotNullParameter(c5938aFs, "");
        Intrinsics.checkNotNullParameter(c5900aFG, "");
        Intrinsics.checkNotNullParameter(c5903aFJ, "");
        Intrinsics.checkNotNullParameter(c5939aFt, "");
        Intrinsics.checkNotNullParameter(c5937aFr, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.EZpvd = c5941aFv;
        this.OLrzqt = c5904aFK;
        this.gEmmrt = interfaceC5687aBF;
        this.djBIcL = c5938aFs;
        this.AEQbTJ = c5900aFG;
        this.valueOf = c5903aFJ;
        this.AhwBna = c5939aFt;
        this.AYXKKw = c5937aFr;
        this.AkhnZx = interfaceC47278tmy;
        MutableLiveData<C5725aBr> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.isConnected = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.KWHzl = mutableLiveData2;
        this.values = mutableLiveData2;
    }

    public final Job EZpvd() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeySelfCheckViewModel$loadPasskeyInfo$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AEQbTJ() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(C32979mnm.EZpvd.OLrzqt()) == 0;
    }

    public final String copydefault() {
        String str;
        int i = Build.VERSION.SDK_INT;
        switch (i) {
            case 25:
                str = "Android 7.1 Nougat";
                break;
            case 26:
                str = "Android 8.0 Oreo";
                break;
            case 27:
                str = "Android 8.1 Oreo";
                break;
            case 28:
                str = "Android 9 Pie";
                break;
            case 29:
                str = "Android 10";
                break;
            case 30:
                str = "Android 11";
                break;
            case 31:
                str = "Android 12";
                break;
            case 32:
                str = "Android 12L";
                break;
            case 33:
                str = "Android 13";
                break;
            case 34:
                str = "Android 14";
                break;
            case 35:
                str = "Android 15";
                break;
            case 36:
                str = "Android 16 Flan";
                break;
            default:
                str = "Unknown (API " + i + ")";
                break;
        }
        return str + " (API " + i + ")";
    }
}
