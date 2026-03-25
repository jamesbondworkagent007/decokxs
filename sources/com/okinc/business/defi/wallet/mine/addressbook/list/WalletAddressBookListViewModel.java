package com.okinc.business.defi.wallet.mine.addressbook.list;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC11252cHi;
import o.Point;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletAddressBookListViewModel extends ViewModel {
    public List<AddressBookEntity> AEQbTJ;
    public final StateFlow<Boolean> AhwBna;
    public final MutableStateFlow<Point<List<AddressBookEntity>>> EZpvd;
    public final MutableStateFlow<Boolean> KWHzl;
    public final StateFlow<Point<List<AddressBookEntity>>> OLrzqt;
    public final InterfaceC11252cHi copydefault;
    public String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Point<List<AddressBookEntity>>> copydefault() {
        return this.OLrzqt;
    }

    @yCM
    public WalletAddressBookListViewModel(@NotNull InterfaceC11252cHi interfaceC11252cHi) {
        Intrinsics.checkNotNullParameter(interfaceC11252cHi, "");
        this.copydefault = interfaceC11252cHi;
        MutableStateFlow<Point<List<AddressBookEntity>>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.OLrzqt = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.KWHzl = MutableStateFlow2;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow2);
        this.valueOf = "";
        this.AEQbTJ = yDY.AhwBna();
        KWHzl();
    }

    public final void copydefault(List<AddressBookEntity> list) {
        this.AEQbTJ = list;
        this.KWHzl.setValue(Boolean.valueOf(list.size() < 200));
    }

    public final boolean AEQbTJ() {
        return this.valueOf.length() > 0 && (this.AEQbTJ.isEmpty() ^ true);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletAddressBookListViewModel$collectAllAddressBooks$1(this, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        List<AddressBookEntity> list;
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
        if (str.length() == 0) {
            list = this.AEQbTJ;
        } else {
            List<AddressBookEntity> list2 = this.AEQbTJ;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                AddressBookEntity addressBookEntity = (AddressBookEntity) obj;
                if (StringsKt__StringsKt.contains$default((CharSequence) addressBookEntity.getAddress(), (CharSequence) str, false, 2, (Object) null) | StringsKt__StringsKt.contains$default((CharSequence) addressBookEntity.getName(), (CharSequence) str, false, 2, (Object) null)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        this.EZpvd.setValue(new Point.Application(list));
    }
}
