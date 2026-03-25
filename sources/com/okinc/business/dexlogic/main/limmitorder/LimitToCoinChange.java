package com.okinc.business.dexlogic.main.limmitorder;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import kotlin.jvm.internal.Intrinsics;
import o.C22332hdP;
import o.C23311hvo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitToCoinChange {
    public static final int $stable = 0;

    public final void toCoinChangeFinish(@NotNull String str, @NotNull MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        if (str.length() == 0) {
            ConsumeData<TradeInputGroup> value = mutableLiveData.getValue();
            Intrinsics.copydefault(value);
            EditTextData editData = value.getData().getToData().getData().getEditData();
            EditTextData editTextDataCopy = editData.copy((32749 & 1) != 0 ? editData.content : "", (32749 & 2) != 0 ? editData.label : C22332hdP.EZpvd(""), (32749 & 4) != 0 ? editData.data : "", (32749 & 8) != 0 ? editData.checkData : null, (32749 & 16) != 0 ? editData.status : 0, (32749 & 32) != 0 ? editData.setInput : false, (32749 & 64) != 0 ? editData.resetFoucs : false, (32749 & 128) != 0 ? editData.secondLabel : null, (32749 & 256) != 0 ? editData.secondDataLabel : null, (32749 & 512) != 0 ? editData.isWarning : false, (32749 & 1024) != 0 ? editData.maxData : null, (32749 & 2048) != 0 ? editData.originPrice : C22332hdP.EZpvd(""), (32749 & 4096) != 0 ? editData.reverseInputData : "", (32749 & 8192) != 0 ? editData.needForbidden : false, (32749 & 16384) != 0 ? editData.isLimit : false);
            ConsumeData<TradeInputGroup> value2 = mutableLiveData.getValue();
            Intrinsics.copydefault(value2);
            TradeInputData tradeInputDataCopy$default = TradeInputData.copy$default(value2.getData().getToData().getData(), null, null, editTextDataCopy, false, 11, null);
            ConsumeData<TradeInputGroup> value3 = mutableLiveData.getValue();
            Intrinsics.copydefault(value3);
            mutableLiveData.setValue(C22332hdP.EZpvd(TradeInputGroup.copy$default(value3.getData(), null, C22332hdP.EZpvd(tradeInputDataCopy$default), null, 5, null)));
            return;
        }
        ConsumeData<TradeInputGroup> value4 = mutableLiveData.getValue();
        Intrinsics.copydefault(value4);
        EditTextData editData2 = value4.getData().getToData().getData().getEditData();
        EditTextData editTextDataCopy2 = editData2.copy((32749 & 1) != 0 ? editData2.content : C23311hvo.AEQbTJ(str), (32749 & 2) != 0 ? editData2.label : null, (32749 & 4) != 0 ? editData2.data : C23311hvo.OLrzqt(str), (32749 & 8) != 0 ? editData2.checkData : null, (32749 & 16) != 0 ? editData2.status : 0, (32749 & 32) != 0 ? editData2.setInput : false, (32749 & 64) != 0 ? editData2.resetFoucs : false, (32749 & 128) != 0 ? editData2.secondLabel : null, (32749 & 256) != 0 ? editData2.secondDataLabel : null, (32749 & 512) != 0 ? editData2.isWarning : false, (32749 & 1024) != 0 ? editData2.maxData : null, (32749 & 2048) != 0 ? editData2.originPrice : null, (32749 & 4096) != 0 ? editData2.reverseInputData : C23311hvo.OLrzqt(str), (32749 & 8192) != 0 ? editData2.needForbidden : false, (32749 & 16384) != 0 ? editData2.isLimit : false);
        ConsumeData<TradeInputGroup> value5 = mutableLiveData.getValue();
        Intrinsics.copydefault(value5);
        TradeInputData tradeInputDataCopy$default2 = TradeInputData.copy$default(value5.getData().getToData().getData(), null, null, editTextDataCopy2, false, 11, null);
        ConsumeData<TradeInputGroup> value6 = mutableLiveData.getValue();
        Intrinsics.copydefault(value6);
        mutableLiveData.setValue(C22332hdP.EZpvd(TradeInputGroup.copy$default(value6.getData(), null, C22332hdP.EZpvd(tradeInputDataCopy$default2), null, 5, null)));
    }
}
