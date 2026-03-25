package com.okinc.kline.features.kline.indexcomponents.viewmodel;

import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC49411unz;
import o.oRC;
import o.oRM;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class IndexComponentsViewModel extends AbstractC49411unz<oRM> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final oRC AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public IndexComponentsViewModel(@NotNull oRC orc) {
        super(new oRM(null, 1, 0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(orc, "");
        this.AEQbTJ = orc;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.features.kline.indexcomponents.viewmodel.IndexComponentsViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new IndexComponentsViewModel$fetchData$1(this, str, null), 3, null), "fetchData");
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new IndexComponentsViewModel$subscribeWs$1(str, this, null), 3, null), "subscribeWs");
    }
}
