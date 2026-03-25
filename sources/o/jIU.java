package o;

import androidx.compose.material3.CalendarModelKt;
import com.okinc.business.market.features.analysis.futures.sub.calendar.data.model.CalendarPo;
import com.okinc.business.market.features.analysis.futures.sub.calendar.domain.usecase.GetCalendarListUseCase$onExecute$1;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.ext.UpDownColor;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C25876jJq;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes6.dex */
public final class jIU extends AbstractC49400uno<Triple<? extends Date, ? extends java.lang.String, ? extends java.lang.String>, C25876jJq> {
    public final jIY EZpvd;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((Triple<? extends Date, java.lang.String, java.lang.String>) obj, (Continuation<? super C25876jJq>) continuation);
    }

    @yCM
    public jIU(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull jIY jiy) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(jiy, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = jiy;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Triple<? extends Date, java.lang.String, java.lang.String> triple, @NotNull Continuation<? super C25876jJq> continuation) throws java.lang.Throwable {
        GetCalendarListUseCase$onExecute$1 getCalendarListUseCase$onExecute$1;
        jIU jiu;
        Date date;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.util.List<CalendarPo.CalendarOneDayPo> calendarOneDayDtos;
        if (continuation instanceof GetCalendarListUseCase$onExecute$1) {
            getCalendarListUseCase$onExecute$1 = (GetCalendarListUseCase$onExecute$1) continuation;
            int i = getCalendarListUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCalendarListUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getCalendarListUseCase$onExecute$1 = new GetCalendarListUseCase$onExecute$1(this, continuation);
            }
        }
        GetCalendarListUseCase$onExecute$1 getCalendarListUseCase$onExecute$12 = getCalendarListUseCase$onExecute$1;
        java.lang.Object obj = getCalendarListUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getCalendarListUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Date dateComponent1 = triple.component1();
            java.lang.String strComponent2 = triple.component2();
            java.lang.String strComponent3 = triple.component3();
            long time = dateComponent1.getTime();
            jIY jiy = this.EZpvd;
            java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(KWHzl());
            getCalendarListUseCase$onExecute$12.L$0 = this;
            getCalendarListUseCase$onExecute$12.L$1 = dateComponent1;
            getCalendarListUseCase$onExecute$12.L$2 = strComponent2;
            getCalendarListUseCase$onExecute$12.label = 1;
            java.lang.Object objEZpvd = jiy.EZpvd(java.lang.String.valueOf(time + CalendarModelKt.MillisecondsIn24Hours), strComponent2, strComponent3, numAEQbTJ, getCalendarListUseCase$onExecute$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            jiu = this;
            date = dateComponent1;
            obj = objEZpvd;
            str = strComponent2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) getCalendarListUseCase$onExecute$12.L$2;
            Date date2 = (Date) getCalendarListUseCase$onExecute$12.L$1;
            jiu = (jIU) getCalendarListUseCase$onExecute$12.L$0;
            C56391yDq.AEQbTJ(obj);
            date = date2;
        }
        CalendarPo calendarPo = (CalendarPo) obj;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "0";
        if (calendarPo == null || (calendarOneDayDtos = calendarPo.getCalendarOneDayDtos()) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(calendarOneDayDtos, 10));
            for (CalendarPo.CalendarOneDayPo calendarOneDayPo : calendarOneDayDtos) {
                objectRef.element = C33129mqd.addS$default(objectRef.element, calendarOneDayPo.getCumulativePnl(), null, null, null, 14, null);
                arrayList.add(new C25876jJq.Application(calendarOneDayPo, new Date(calendarOneDayPo.getDateTime()), jiu.KWHzl(C33129mqd.EZpvd(calendarOneDayPo.getCumulativePnl())), UpDownColor.Companion.AEQbTJ(calendarOneDayPo.getCumulativePnl())));
            }
        }
        java.util.List listAhwBna = arrayList == null ? yDY.AhwBna() : arrayList;
        if (str == null) {
            str = "USDT";
        }
        UpDownColor upDownColorAEQbTJ = UpDownColor.Companion.AEQbTJ((java.lang.String) objectRef.element);
        java.lang.String str2 = str;
        objectRef.element = C59449zhJ.replace$default(C38305pTw.formatCryptoCode$default(C33129mqd.EZpvd(objectRef.element), str2, null, null, DisplaySign.EXCEPT_ZERO, null, null, 54, null), str2, "", false, 4, (java.lang.Object) null);
        return new C25876jJq(calendarPo, date, listAhwBna, (java.lang.String) objectRef.element, upDownColorAEQbTJ, str);
    }

    public final java.lang.String KWHzl(BigDecimal bigDecimal) {
        java.lang.String str = C33129mqd.AEQbTJ(bigDecimal, 0) ? Marker.ANY_NON_NULL_MARKER : "";
        BigDecimal bigDecimalAbs = bigDecimal.abs();
        if (bigDecimalAbs.compareTo(new BigDecimal("0.1")) < 0) {
            return str + bigDecimal.setScale(2, RoundingMode.HALF_UP).toPlainString();
        }
        if (bigDecimalAbs.compareTo(new BigDecimal("1000")) < 0) {
            return str + bigDecimal.setScale(1, RoundingMode.HALF_UP).toPlainString();
        }
        if (bigDecimalAbs.compareTo(new BigDecimal("1000000")) < 0) {
            return str + bigDecimal.divide(new BigDecimal("1000")).setScale(1, RoundingMode.HALF_UP).toPlainString() + "k";
        }
        if (bigDecimalAbs.compareTo(new BigDecimal("1000000000")) < 0) {
            return str + bigDecimal.divide(new BigDecimal("1000000")).setScale(1, RoundingMode.HALF_UP).toPlainString() + "M";
        }
        return str + bigDecimal.divide(new BigDecimal("1000000000")).setScale(1, RoundingMode.HALF_UP).toPlainString() + "B";
    }

    public final int KWHzl() {
        return (TimeZone.getDefault().getRawOffset() / 1000) / IMarketApiService.SIXTY_MINUTES;
    }
}
