package o;

import com.keystone.sdk.KeystoneSDK;
import com.welie.blessed.WriteType;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C57003yaH;
import o.C57138yck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yaK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57006yaK implements InterfaceC57004yaI {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm<C57138yck> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm<C57080ybf> copydefault;

    public C57006yaK(@NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.yaG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C57006yaK.EZpvd();
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.yaJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C57006yaK.EZpvd(context);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.yaL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C57006yaK.KWHzl(context);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.yaN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C57006yaK.AEQbTJ(this.EZpvd);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.yaP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C57006yaK.AEQbTJ(context, this);
            }
        });
    }

    public final C57013yaR AYXKKw() {
        return (C57013yaR) this.AEQbTJ.getValue();
    }

    public static final C57013yaR EZpvd() {
        KeystoneSDK keystoneSDK = new KeystoneSDK();
        AbstractC58253yxm abstractC58253yxmOLrzqt = C58266yxz.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(abstractC58253yxmOLrzqt, "");
        return new C57013yaR(keystoneSDK, abstractC58253yxmOLrzqt);
    }

    public static final C57080ybf EZpvd(android.content.Context context) {
        C57008yaM c57008yaM = new C57008yaM(context, C57140ycm.KWHzl.KWHzl(context), "ledger_bundle.zip");
        C48787ucK c48787ucK = C48787ucK.AEQbTJ;
        android.content.Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        UUID uuidFromString = UUID.fromString("13D63400-2C97-0004-0000-4C6564676572");
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
        UUID uuidFromString2 = UUID.fromString("13d63400-2c97-0004-0001-4c6564676572");
        Intrinsics.checkNotNullExpressionValue(uuidFromString2, "");
        UUID uuidFromString3 = UUID.fromString("13d63400-2c97-0004-0003-4c6564676572");
        Intrinsics.checkNotNullExpressionValue(uuidFromString3, "");
        WriteType writeType = WriteType.WITHOUT_RESPONSE;
        C57003yaH.ActionBar actionBar = new C57003yaH.ActionBar(uuidFromString3, writeType);
        UUID uuidFromString4 = UUID.fromString("13d63400-2c97-0004-0002-4c6564676572");
        Intrinsics.checkNotNullExpressionValue(uuidFromString4, "");
        WriteType writeType2 = WriteType.WITH_RESPONSE;
        C57003yaH.TaskDescription taskDescription = new C57003yaH.TaskDescription(uuidFromString, uuidFromString2, yDY.gEmmrt(actionBar, new C57003yaH.ActionBar(uuidFromString4, writeType2)));
        UUID uuidFromString5 = UUID.fromString("13d63400-2c97-3004-0000-4c6564676572");
        Intrinsics.checkNotNullExpressionValue(uuidFromString5, "");
        UUID uuidFromString6 = UUID.fromString("13d63400-2c97-3004-0001-4c6564676572");
        Intrinsics.checkNotNullExpressionValue(uuidFromString6, "");
        UUID uuidFromString7 = UUID.fromString("13d63400-2c97-3004-0003-4c6564676572");
        Intrinsics.checkNotNullExpressionValue(uuidFromString7, "");
        C57003yaH.ActionBar actionBar2 = new C57003yaH.ActionBar(uuidFromString7, writeType);
        UUID uuidFromString8 = UUID.fromString("13d63400-2c97-3004-0002-4c6564676572");
        Intrinsics.checkNotNullExpressionValue(uuidFromString8, "");
        return new C57080ybf(c57008yaM, c48787ucK, new C57003yaH(applicationContext, yDY.gEmmrt(taskDescription, new C57003yaH.TaskDescription(uuidFromString5, uuidFromString6, yDY.gEmmrt(actionBar2, new C57003yaH.ActionBar(uuidFromString8, writeType2))))));
    }

    public static final C57138yck KWHzl(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        android.content.Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
        C57138yck.Application application = C57138yck.Companion;
        UUID uuidKWHzl = application.KWHzl();
        Intrinsics.checkNotNullExpressionValue(uuidKWHzl, "");
        UUID uuidAEQbTJ = application.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(uuidAEQbTJ, "");
        UUID uuidOLrzqt = application.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(uuidOLrzqt, "");
        return new C57138yck(applicationContext, new C57003yaH(applicationContext2, C56402yEa.EZpvd(new C57003yaH.TaskDescription(uuidKWHzl, uuidAEQbTJ, C56402yEa.EZpvd(new C57003yaH.ActionBar(uuidOLrzqt, WriteType.WITHOUT_RESPONSE))))), C48872udq.AEQbTJ, C57026yae.copydefault, C33489mxS.KWHzl.AEQbTJ(), new android.os.Handler(android.os.Looper.getMainLooper()));
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/yah; */
    @Override // o.InterfaceC57004yaI
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public C57076ybb copydefault() {
        return (C57076ybb) this.OLrzqt.getValue();
    }

    public static final C57076ybb AEQbTJ(C57006yaK c57006yaK) {
        return new C57076ybb(c57006yaK.AYXKKw());
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/yaF; */
    @Override // o.InterfaceC57004yaI
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C57150ycw OLrzqt() {
        return (C57150ycw) this.KWHzl.getValue();
    }

    public static final C57150ycw AEQbTJ(android.content.Context context, C57006yaK c57006yaK) {
        return new C57150ycw(context, C57026yae.copydefault, c57006yaK.copydefault, c57006yaK.EZpvd);
    }
}
