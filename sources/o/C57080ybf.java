package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import o.C57003yaH;
import o.C57032yak;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ybf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57080ybf implements InterfaceC56999yaD, C57003yaH.Application {
    public final java.util.Set<InterfaceC57025yad> AEQbTJ;
    public final java.util.Set<C57032yak.TaskDescription> AYXKKw;
    public final InterfaceC48786ucJ AhwBna;
    public C57089ybo EZpvd;
    public final C57003yaH KWHzl;
    public final C57008yaM OLrzqt;
    public final java.util.Set<C57032yak.StateListAnimator> copydefault;
    public final java.util.Set<C57032yak.Activity> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56999yaD
    public InterfaceC57036yao AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.C57003yaH.Application
    public void EZpvd() {
    }

    public C57080ybf(@NotNull C57008yaM c57008yaM, @NotNull InterfaceC48786ucJ interfaceC48786ucJ, @NotNull C57003yaH c57003yaH) {
        Intrinsics.checkNotNullParameter(c57008yaM, "");
        Intrinsics.checkNotNullParameter(interfaceC48786ucJ, "");
        Intrinsics.checkNotNullParameter(c57003yaH, "");
        this.OLrzqt = c57008yaM;
        this.AhwBna = interfaceC48786ucJ;
        this.KWHzl = c57003yaH;
        c57003yaH.AEQbTJ(this);
        this.AEQbTJ = new LinkedHashSet();
        this.djBIcL = new LinkedHashSet();
        this.copydefault = new LinkedHashSet();
        this.AYXKKw = new LinkedHashSet();
    }

    public final JsonObject OLrzqt() {
        return this.AhwBna.AEQbTJ("hardwareWallet");
    }

    @Override // o.C57003yaH.Application
    public void AEQbTJ(@NotNull C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        if (this.EZpvd != null) {
            AYXKKw(c58160yvz);
            return;
        }
        for (C57032yak.TaskDescription taskDescription : this.AYXKKw) {
            java.lang.String strDbNXlk = c58160yvz.DbNXlk();
            java.lang.String strAkhnZx = c58160yvz.AkhnZx();
            Intrinsics.checkNotNullExpressionValue(strAkhnZx, "");
            taskDescription.OLrzqt(new BluetoothDeviceModel(strDbNXlk, strAkhnZx, ""));
        }
    }

    @Override // o.C57003yaH.Application
    public void djBIcL(@NotNull C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        for (C57032yak.Activity activity : this.djBIcL) {
            java.lang.String strDbNXlk = c58160yvz.DbNXlk();
            java.lang.String strAkhnZx = c58160yvz.AkhnZx();
            Intrinsics.checkNotNullExpressionValue(strAkhnZx, "");
            activity.KWHzl(new BluetoothDeviceModel(strDbNXlk, strAkhnZx, ""));
        }
    }

    @Override // o.C57003yaH.Application
    public void AEQbTJ(int i) {
        java.util.Iterator<T> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            ((InterfaceC57025yad) it.next()).AEQbTJ(i);
        }
    }

    @Override // o.C57003yaH.Application
    public void KWHzl(@NotNull C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        java.util.Iterator<T> it = this.copydefault.iterator();
        while (it.hasNext()) {
            ((C57032yak.StateListAnimator) it.next()).AEQbTJ();
        }
    }

    @Override // o.C57003yaH.Application
    public void OLrzqt(@NotNull C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        java.util.Iterator<T> it = this.copydefault.iterator();
        while (it.hasNext()) {
            ((C57032yak.StateListAnimator) it.next()).KWHzl();
        }
    }

    @Override // o.C57003yaH.Application
    public void valueOf(@NotNull C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        c58160yvz.EZpvd(512);
    }

    @Override // o.C57003yaH.Application
    public void EZpvd(@NotNull C58160yvz c58160yvz, int i) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        C57089ybo.Companion.copydefault(i);
    }

    @Override // o.C57003yaH.Application
    public void AEQbTJ(@NotNull C58160yvz c58160yvz, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        Intrinsics.checkNotNullParameter(str, "");
        C57089ybo c57089ybo = this.EZpvd;
        if (c57089ybo != null) {
            c57089ybo.AEQbTJ(c58160yvz);
            c57089ybo.KWHzl(str);
        } else {
            C57089ybo c57089ybo2 = new C57089ybo(c58160yvz, str);
            java.util.Iterator<T> it = this.AYXKKw.iterator();
            while (it.hasNext()) {
                ((C57032yak.TaskDescription) it.next()).copydefault(c57089ybo2);
            }
            this.EZpvd = c57089ybo2;
        }
        C57089ybo.Companion.KWHzl();
    }

    @Override // o.C57003yaH.Application
    public void copydefault(@NotNull C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        for (C57032yak.TaskDescription taskDescription : this.AYXKKw) {
            C57089ybo c57089ybo = this.EZpvd;
            if (c57089ybo == null) {
                return;
            } else {
                taskDescription.copydefault(c57089ybo);
            }
        }
    }

    @Override // o.C57003yaH.Application
    public void EZpvd(@NotNull C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        AYXKKw(c58160yvz);
    }

    @Override // o.C57003yaH.Application
    public void gEmmrt(@NotNull C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        AYXKKw(c58160yvz);
    }

    @Override // o.C57003yaH.Application
    public void KWHzl(@NotNull C58160yvz c58160yvz, @NotNull byte[] bArr, @NotNull android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bluetoothGattCharacteristic, "");
        C57089ybo.Companion.KWHzl(bArr);
    }

    public final void AYXKKw(C58160yvz c58160yvz) {
        C57089ybo c57089ybo = this.EZpvd;
        if (c57089ybo != null) {
            c57089ybo.EZpvd(true);
        }
        this.EZpvd = null;
        C57089ybo.Companion.OLrzqt();
        for (C57032yak.TaskDescription taskDescription : this.AYXKKw) {
            java.lang.String strDbNXlk = c58160yvz.DbNXlk();
            java.lang.String strAkhnZx = c58160yvz.AkhnZx();
            Intrinsics.checkNotNullExpressionValue(strAkhnZx, "");
            taskDescription.EZpvd(new BluetoothDeviceModel(strDbNXlk, strAkhnZx, ""));
        }
    }

    @Override // o.InterfaceC56999yaD
    public boolean copydefault() {
        JsonElement jsonElement;
        JsonObject jsonObjectOLrzqt = OLrzqt();
        java.lang.String asString = (jsonObjectOLrzqt == null || (jsonElement = jsonObjectOLrzqt.get("jsVersion")) == null) ? null : jsonElement.getAsString();
        pUU.KWHzl("LedgerManager", "checkJSBundle version " + asString);
        return this.OLrzqt.copydefault(asString);
    }

    @Override // o.InterfaceC56999yaD
    public AbstractC58260yxt<java.lang.Boolean> KWHzl() {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonElement jsonElement4;
        JsonObject jsonObjectOLrzqt = OLrzqt();
        java.lang.String asString = null;
        pUU.KWHzl("LedgerManager", "downloadJSBundle " + ((jsonObjectOLrzqt == null || (jsonElement4 = jsonObjectOLrzqt.get("jsUrl2")) == null) ? null : jsonElement4.getAsString()) + " " + ((jsonObjectOLrzqt == null || (jsonElement3 = jsonObjectOLrzqt.get("jsVersion")) == null) ? null : jsonElement3.getAsString()));
        C57008yaM c57008yaM = this.OLrzqt;
        java.lang.String asString2 = (jsonObjectOLrzqt == null || (jsonElement2 = jsonObjectOLrzqt.get("jsUrl2")) == null) ? null : jsonElement2.getAsString();
        if (jsonObjectOLrzqt != null && (jsonElement = jsonObjectOLrzqt.get("jsVersion")) != null) {
            asString = jsonElement.getAsString();
        }
        return c57008yaM.AEQbTJ(asString2, asString);
    }

    @Override // o.InterfaceC56999yaD
    public void AhwBna() {
        this.KWHzl.copydefault();
    }

    @Override // o.InterfaceC56999yaD
    public void AYXKKw() {
        this.KWHzl.AEQbTJ();
    }

    @Override // o.InterfaceC56999yaD
    public boolean EZpvd(@NotNull android.content.Context context, @NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        return this.KWHzl.OLrzqt(context, bluetoothDeviceModel.getAddress());
    }

    @Override // o.InterfaceC56999yaD
    public void OLrzqt(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        C57003yaH c57003yaH = this.KWHzl;
        C57089ybo c57089ybo = this.EZpvd;
        c57003yaH.copydefault(bluetoothDeviceModel, c57089ybo != null ? c57089ybo.OLrzqt().getAddress() : null);
    }

    @Override // o.InterfaceC56999yaD
    public void copydefault(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        this.KWHzl.EZpvd(bluetoothDeviceModel);
    }

    @Override // o.InterfaceC56999yaD
    public void EZpvd(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        this.KWHzl.KWHzl(bluetoothDeviceModel.getAddress());
    }

    @Override // o.InterfaceC56999yaD
    public void copydefault(@NotNull InterfaceC57025yad interfaceC57025yad) {
        Intrinsics.checkNotNullParameter(interfaceC57025yad, "");
        this.AEQbTJ.add(interfaceC57025yad);
    }

    @Override // o.InterfaceC56999yaD
    public void AEQbTJ(@NotNull InterfaceC57025yad interfaceC57025yad) {
        Intrinsics.checkNotNullParameter(interfaceC57025yad, "");
        this.AEQbTJ.remove(interfaceC57025yad);
    }

    @Override // o.InterfaceC56999yaD
    public void copydefault(@NotNull C57032yak.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.djBIcL.add(activity);
    }

    @Override // o.InterfaceC56999yaD
    public void OLrzqt(@NotNull C57032yak.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.djBIcL.remove(activity);
    }

    @Override // o.InterfaceC56999yaD
    public void AEQbTJ(@NotNull C57032yak.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.copydefault.add(stateListAnimator);
    }

    @Override // o.InterfaceC56999yaD
    public void EZpvd(@NotNull C57032yak.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.copydefault.remove(stateListAnimator);
    }

    @Override // o.InterfaceC56999yaD
    public void EZpvd(@NotNull C57032yak.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.AYXKKw.add(taskDescription);
    }

    @Override // o.InterfaceC56999yaD
    public void KWHzl(@NotNull C57032yak.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.AYXKKw.remove(taskDescription);
    }

    public final void EZpvd(@NotNull C57089ybo c57089ybo) {
        Intrinsics.checkNotNullParameter(c57089ybo, "");
        C57089ybo c57089ybo2 = this.EZpvd;
        c57089ybo.EZpvd(c57089ybo2 != null ? c57089ybo2.AYXKKw() : false);
        this.EZpvd = c57089ybo;
    }

    @Override // o.InterfaceC56999yaD
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.gEmmrt(str, "13d63400-2c97-3004-0000-4c6564676572", true);
    }
}
