package o;

import androidx.camera.core.ImageAnalysis$$ExternalSyntheticBackport3;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Arrays;
import java.util.Collections;
import o.C32392mcI;

/* JADX INFO: loaded from: classes9.dex */
public class pDK {
    public static java.lang.String OLrzqt = "short";
    public static final java.util.HashMap<java.lang.String, java.util.List<java.lang.Integer>> EZpvd = new java.util.HashMap<java.lang.String, java.util.List<java.lang.Integer>>() { // from class: com.okinc.kline.util.ChartConst$1
        /* JADX DEBUG: Class process forced to load method for inline: o.pDH.EZpvd(java.lang.Object):java.util.List */
        /* JADX DEBUG: Class process forced to load method for inline: o.pDI.AEQbTJ(java.lang.Object, java.lang.Object):java.util.List */
        /* JADX DEBUG: Class process forced to load method for inline: o.pDJ.EZpvd(java.lang.Object):java.util.List */
        /* JADX DEBUG: Class process forced to load method for inline: o.pDL.copydefault(java.lang.Object, java.lang.Object, java.lang.Object):java.util.List */
        {
            put("MACD", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.djSkpj), Integer.valueOf(C32392mcI.Dialog.dNCPSb), Integer.valueOf(C32392mcI.Dialog.UeEOUB)));
            put("KDJ", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.RcXXUw), Integer.valueOf(C32392mcI.Dialog.gwTjWJ), Integer.valueOf(C32392mcI.Dialog.RdAHlO)));
            put("SKDJ", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.RcXXUw), Integer.valueOf(C32392mcI.Dialog.UeEOUB)));
            put("BOLL", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.QkdxfA), Integer.valueOf(C32392mcI.Dialog.QHmsKR)));
            put("RSI", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.DLWbHP), Integer.valueOf(C32392mcI.Dialog.hrNTAI), Integer.valueOf(C32392mcI.Dialog.OJuSTm), Integer.valueOf(C32392mcI.Dialog.OxVOHk), Integer.valueOf(C32392mcI.Dialog.QSLkRj)));
            put("SR", ImageAnalysis$$ExternalSyntheticBackport3.m(new Object[]{Integer.valueOf(C32392mcI.Dialog.hvKCwS)}));
            put("SUPERTREND", ImageAnalysis$$ExternalSyntheticBackport3.m(new Object[]{Integer.valueOf(C32392mcI.Dialog.aJFbMH), Integer.valueOf(C32392mcI.Dialog.UscePu)}));
            put("StochRSI", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.aKErDB), Integer.valueOf(C32392mcI.Dialog.finit), Integer.valueOf(C32392mcI.Dialog.QCjLjM), Integer.valueOf(C32392mcI.Dialog.QVsKAR)));
            put("DMA", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.djSkpj), Integer.valueOf(C32392mcI.Dialog.dNCPSb), Integer.valueOf(C32392mcI.Dialog.UeEOUB)));
            put("TRIX", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.dUDNAs), Integer.valueOf(C32392mcI.Dialog.UlJrfe)));
            put("VR", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.USBtdM), Integer.valueOf(C32392mcI.Dialog.QwvEab)));
            put("BRAR", Collections.singletonList(Integer.valueOf(C32392mcI.Dialog.RcXXUw)));
            put("EMV", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.dHguZz), Integer.valueOf(C32392mcI.Dialog.OBJEWx)));
            put("WR", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.aUsmxb), Integer.valueOf(C32392mcI.Dialog.igXuih)));
            put("ROC", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.OFhtUX), Integer.valueOf(C32392mcI.Dialog.fdOvFl)));
            put("MTM", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.dmfpNf), Integer.valueOf(C32392mcI.Dialog.OHqIaq)));
            put("PSY", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.fZBcTu), Integer.valueOf(C32392mcI.Dialog.ODXsMY)));
            put("DMI", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.RKDWNf), Integer.valueOf(C32392mcI.Dialog.hBpjJd)));
            put("CCI", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.aHXSQp)));
            put("OI", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.run)));
            put("LSAcco", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.alsFma), Integer.valueOf(C32392mcI.Dialog.DGUQLI), Integer.valueOf(C32392mcI.Dialog.heceqZ)));
            put("LSPos", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.alsFma), Integer.valueOf(C32392mcI.Dialog.DGUQLI), Integer.valueOf(C32392mcI.Dialog.heceqZ)));
            put("LSRatio", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.alsFma), Integer.valueOf(C32392mcI.Dialog.DGUQLI), Integer.valueOf(C32392mcI.Dialog.heceqZ)));
            put("BSVol", Arrays.asList(Integer.valueOf(C32392mcI.Dialog.QIZEnU), Integer.valueOf(C32392mcI.Dialog.QXDzTk)));
            put("ENVELOPE", ImageAnalysis$$ExternalSyntheticBackport3.m(new Object[]{Integer.valueOf(C32392mcI.Dialog.UhxbNG), Integer.valueOf(C32392mcI.Dialog.RXzakW), Integer.valueOf(C32392mcI.Dialog.ULRxlR)}));
            put("VWAP", ImageAnalysis$$ExternalSyntheticBackport3.m(new Object[]{Integer.valueOf(C32392mcI.Dialog.OqFWZa)}));
        }
    };
    public static final java.util.HashMap<java.lang.Integer, java.lang.Integer> AEQbTJ = new java.util.HashMap<java.lang.Integer, java.lang.Integer>() { // from class: com.okinc.kline.util.ChartConst$2
        {
            put(21600, 1);
            put(43200, 2);
            put(Integer.valueOf(RemoteMessageConst.DEFAULT_TTL), 3);
            put(172800, 4);
            put(259200, 5);
            put(432000, 6);
            put(604800, 7);
            put(2678400, 8);
            put(8035200, 9);
            put(16070400, 10);
            put(31536000, 11);
        }
    };
}
