package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public class pXE {
    public static java.lang.String copydefault(long j) {
        return pTA.KWHzl(new Date(j), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM);
    }

    public static java.lang.String OLrzqt(long j) {
        return pTA.AEQbTJ(new Date(j));
    }
}
