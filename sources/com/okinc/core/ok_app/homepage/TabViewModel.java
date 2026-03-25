package com.okinc.core.ok_app.homepage;

import android.content.Intent;
import android.view.MenuItem;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.android.material.navigation.NavigationBarView;
import com.okinc.core.ok_app.homepage.TabViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C33259mtA;
import o.C56392yDr;
import o.InterfaceC33248msq;
import o.InterfaceC33252msu;
import o.InterfaceC56387yDm;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TabViewModel extends ViewModel {
    public int AEQbTJ;
    public List<? extends InterfaceC33248msq> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final C33259mtA OLrzqt;
    public final List<InterfaceC33248msq> copydefault;
    public final InterfaceC56387yDm gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.AEQbTJ = i;
    }

    @yCM
    public TabViewModel(@NotNull C33259mtA c33259mtA) {
        Intrinsics.checkNotNullParameter(c33259mtA, "");
        this.OLrzqt = c33259mtA;
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.mtB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TabViewModel.OLrzqt(this.AEQbTJ);
            }
        });
        this.copydefault = new ArrayList();
        this.EZpvd = yDY.AhwBna();
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mtz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TabViewModel.AEQbTJ(this.KWHzl);
            }
        });
    }

    public final MutableLiveData<Integer> OLrzqt() {
        return (MutableLiveData) this.gEmmrt.getValue();
    }

    public static final MutableLiveData OLrzqt(TabViewModel tabViewModel) {
        return new MutableLiveData(Integer.valueOf(tabViewModel.AEQbTJ));
    }

    public final MutableLiveData<List<InterfaceC33248msq>> copydefault() {
        return (MutableLiveData) this.KWHzl.getValue();
    }

    public static final MutableLiveData AEQbTJ(TabViewModel tabViewModel) {
        return new MutableLiveData(tabViewModel.EZpvd);
    }

    public final void EZpvd(@NotNull InterfaceC33252msu interfaceC33252msu) {
        Intrinsics.checkNotNullParameter(interfaceC33252msu, "");
        KWHzl("pro_pay");
        Iterator<T> it = this.copydefault.iterator();
        while (it.hasNext()) {
            ((InterfaceC33248msq) it.next()).OLrzqt(interfaceC33252msu);
        }
        List<InterfaceC33248msq> list = this.copydefault;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterfaceC33248msq) obj).EZpvd()) {
                arrayList.add(obj);
            }
        }
        this.EZpvd = arrayList;
        InterfaceC33248msq interfaceC33248msq = (InterfaceC33248msq) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        this.AEQbTJ = interfaceC33248msq != null ? interfaceC33248msq.AEQbTJ() : 0;
    }

    public final void KWHzl(String str) {
        this.copydefault.clear();
        this.copydefault.addAll(this.OLrzqt.OLrzqt(str));
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.copydefault.clear();
    }

    public final boolean copydefault(@NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        return this.AEQbTJ == menuItem.getItemId();
    }

    public final InterfaceC33248msq KWHzl() {
        return AEQbTJ(this.AEQbTJ);
    }

    public final boolean EZpvd(@NotNull NavigationBarView navigationBarView, @NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        Intrinsics.checkNotNullParameter(menuItem, "");
        return AEQbTJ(menuItem.getItemId()).OLrzqt(navigationBarView, menuItem);
    }

    public final void copydefault(@NotNull NavigationBarView navigationBarView, @NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        Intrinsics.checkNotNullParameter(menuItem, "");
        AEQbTJ(menuItem.getItemId()).AEQbTJ(navigationBarView, menuItem);
    }

    public final InterfaceC33248msq EZpvd(Intent intent) {
        Object next;
        Iterator<T> it = this.EZpvd.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC33248msq) next).copydefault(intent)) {
                break;
            }
        }
        return (InterfaceC33248msq) next;
    }

    public final void KWHzl(@NotNull NavigationBarView navigationBarView) {
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        Iterator<T> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            ((InterfaceC33248msq) it.next()).AEQbTJ(navigationBarView);
        }
    }

    public final InterfaceC33248msq AEQbTJ(int i) {
        Object next;
        Iterator<T> it = this.EZpvd.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC33248msq) next).AEQbTJ() == i) {
                break;
            }
        }
        InterfaceC33248msq interfaceC33248msq = (InterfaceC33248msq) next;
        return interfaceC33248msq == null ? this.EZpvd.get(0) : interfaceC33248msq;
    }

    public final InterfaceC33248msq copydefault(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = this.EZpvd.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((InterfaceC33248msq) next).OLrzqt(), (Object) str)) {
                break;
            }
        }
        return (InterfaceC33248msq) next;
    }

    public final void AEQbTJ(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        Iterator<T> it = this.copydefault.iterator();
        while (it.hasNext()) {
            ((InterfaceC33248msq) it.next()).EZpvd(intent);
        }
    }
}
