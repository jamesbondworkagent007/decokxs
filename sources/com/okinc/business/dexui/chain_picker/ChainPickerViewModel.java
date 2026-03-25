package com.okinc.business.dexui.chain_picker;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C25983jNp;
import o.C56391yDq;
import o.InterfaceC23411hxi;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ChainPickerViewModel extends ViewModel {
    public final CoroutineDispatcher AEQbTJ;
    public final C25983jNp KWHzl;
    public final StateFlow<InterfaceC23411hxi> OLrzqt;
    public final MutableStateFlow<InterfaceC23411hxi> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC23411hxi> OLrzqt() {
        return this.OLrzqt;
    }

    @yCM
    public ChainPickerViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C25983jNp c25983jNp) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c25983jNp, "");
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = c25983jNp;
        MutableStateFlow<InterfaceC23411hxi> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC23411hxi.Activity.AEQbTJ);
        this.copydefault = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void AEQbTJ() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AEQbTJ, null, new ChainPickerViewModel$loadData$1(this, null), 2, null);
    }

    public final Object copydefault(@NotNull String str, @NotNull Continuation<? super Result<? extends List<MarketChainBean>>> continuation) {
        List listAhwBna;
        try {
            Result.Application application = Result.Companion;
            InterfaceC23411hxi value = this.copydefault.getValue();
            InterfaceC23411hxi.Application application2 = value instanceof InterfaceC23411hxi.Application ? (InterfaceC23411hxi.Application) value : null;
            List<MarketChainBean> listCopydefault = application2 != null ? application2.copydefault() : null;
            if (listCopydefault == null) {
                listCopydefault = yDY.AhwBna();
            }
            if (listCopydefault.isEmpty()) {
                listAhwBna = yDY.AhwBna();
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listCopydefault) {
                    if (StringsKt__StringsKt.AhwBna((CharSequence) ((MarketChainBean) obj).getChainName(), (CharSequence) str, true)) {
                        arrayList.add(obj);
                    }
                }
                listAhwBna = arrayList;
            }
            return Result.m7377constructorimpl(listAhwBna);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
