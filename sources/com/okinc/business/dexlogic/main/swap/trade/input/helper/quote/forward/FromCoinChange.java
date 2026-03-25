package com.okinc.business.dexlogic.main.swap.trade.input.helper.quote.forward;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import kotlin.jvm.internal.Intrinsics;
import o.C22332hdP;
import o.C23311hvo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class FromCoinChange {
    public static final int $stable = 0;

    public static /* synthetic */ void fromCoinChangeFinish$default(FromCoinChange fromCoinChange, String str, String str2, MutableLiveData mutableLiveData, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        fromCoinChange.fromCoinChangeFinish(str, str2, mutableLiveData);
    }

    public final void fromCoinChangeFinish(@NotNull String str, @NotNull String str2, @NotNull MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData) {
        String strOLrzqt = str2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strOLrzqt, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        if (Intrinsics.EZpvd((Object) strOLrzqt, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            strOLrzqt = C23311hvo.OLrzqt(str);
        }
        String str3 = strOLrzqt;
        if (str.length() == 0) {
            ConsumeData<TradeInputGroup> value = mutableLiveData.getValue();
            Intrinsics.copydefault(value);
            EditTextData editData = value.getData().getFromData().getData().getEditData();
            EditTextData editTextDataCopy = editData.copy((32749 & 1) != 0 ? editData.content : "", (32749 & 2) != 0 ? editData.label : C22332hdP.EZpvd(""), (32749 & 4) != 0 ? editData.data : "", (32749 & 8) != 0 ? editData.checkData : null, (32749 & 16) != 0 ? editData.status : 0, (32749 & 32) != 0 ? editData.setInput : false, (32749 & 64) != 0 ? editData.resetFoucs : false, (32749 & 128) != 0 ? editData.secondLabel : null, (32749 & 256) != 0 ? editData.secondDataLabel : null, (32749 & 512) != 0 ? editData.isWarning : false, (32749 & 1024) != 0 ? editData.maxData : null, (32749 & 2048) != 0 ? editData.originPrice : C22332hdP.EZpvd(""), (32749 & 4096) != 0 ? editData.reverseInputData : null, (32749 & 8192) != 0 ? editData.needForbidden : false, (32749 & 16384) != 0 ? editData.isLimit : false);
            ConsumeData<TradeInputGroup> value2 = mutableLiveData.getValue();
            Intrinsics.copydefault(value2);
            TradeInputData tradeInputDataCopy$default = TradeInputData.copy$default(value2.getData().getFromData().getData(), null, null, editTextDataCopy, false, 11, null);
            ConsumeData<TradeInputGroup> value3 = mutableLiveData.getValue();
            Intrinsics.copydefault(value3);
            EditTextData editData2 = value3.getData().getToData().getData().getEditData();
            EditTextData editTextDataCopy2 = editData2.copy((32749 & 1) != 0 ? editData2.content : "", (32749 & 2) != 0 ? editData2.label : C22332hdP.EZpvd(""), (32749 & 4) != 0 ? editData2.data : "", (32749 & 8) != 0 ? editData2.checkData : null, (32749 & 16) != 0 ? editData2.status : 0, (32749 & 32) != 0 ? editData2.setInput : true, (32749 & 64) != 0 ? editData2.resetFoucs : false, (32749 & 128) != 0 ? editData2.secondLabel : null, (32749 & 256) != 0 ? editData2.secondDataLabel : null, (32749 & 512) != 0 ? editData2.isWarning : false, (32749 & 1024) != 0 ? editData2.maxData : null, (32749 & 2048) != 0 ? editData2.originPrice : C22332hdP.EZpvd(""), (32749 & 4096) != 0 ? editData2.reverseInputData : "", (32749 & 8192) != 0 ? editData2.needForbidden : false, (32749 & 16384) != 0 ? editData2.isLimit : false);
            ConsumeData<TradeInputGroup> value4 = mutableLiveData.getValue();
            Intrinsics.copydefault(value4);
            TradeInputData tradeInputDataCopy$default2 = TradeInputData.copy$default(value4.getData().getToData().getData(), null, null, editTextDataCopy2, false, 11, null);
            ConsumeData<TradeInputGroup> value5 = mutableLiveData.getValue();
            Intrinsics.copydefault(value5);
            mutableLiveData.setValue(C22332hdP.EZpvd(TradeInputGroup.copy$default(value5.getData(), C22332hdP.EZpvd(tradeInputDataCopy$default), C22332hdP.EZpvd(tradeInputDataCopy$default2), null, 4, null)));
            return;
        }
        ConsumeData<TradeInputGroup> value6 = mutableLiveData.getValue();
        Intrinsics.copydefault(value6);
        EditTextData editData3 = value6.getData().getFromData().getData().getEditData();
        EditTextData editTextDataCopy3 = editData3.copy((32749 & 1) != 0 ? editData3.content : C23311hvo.AEQbTJ(str), (32749 & 2) != 0 ? editData3.label : null, (32749 & 4) != 0 ? editData3.data : str3, (32749 & 8) != 0 ? editData3.checkData : null, (32749 & 16) != 0 ? editData3.status : 0, (32749 & 32) != 0 ? editData3.setInput : false, (32749 & 64) != 0 ? editData3.resetFoucs : false, (32749 & 128) != 0 ? editData3.secondLabel : null, (32749 & 256) != 0 ? editData3.secondDataLabel : null, (32749 & 512) != 0 ? editData3.isWarning : false, (32749 & 1024) != 0 ? editData3.maxData : null, (32749 & 2048) != 0 ? editData3.originPrice : null, (32749 & 4096) != 0 ? editData3.reverseInputData : null, (32749 & 8192) != 0 ? editData3.needForbidden : false, (32749 & 16384) != 0 ? editData3.isLimit : false);
        ConsumeData<TradeInputGroup> value7 = mutableLiveData.getValue();
        Intrinsics.copydefault(value7);
        TradeInputData tradeInputDataCopy$default3 = TradeInputData.copy$default(value7.getData().getFromData().getData(), null, null, editTextDataCopy3, false, 11, null);
        ConsumeData<TradeInputGroup> value8 = mutableLiveData.getValue();
        Intrinsics.copydefault(value8);
        mutableLiveData.setValue(C22332hdP.EZpvd(TradeInputGroup.copy$default(value8.getData(), C22332hdP.EZpvd(tradeInputDataCopy$default3), null, null, 6, null)));
    }
}
