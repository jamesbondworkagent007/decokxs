package o;

import androidx.viewpager2.widget.ViewPager2;
import com.okinc.business.market.bean.CoinQuote;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C46802tdz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tdz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46802tdz {
    public java.util.List<C46797tdu<?>> AEQbTJ;
    public final C46796tdt AhwBna;
    public final InterfaceC46790tdn EZpvd;
    public java.util.List<?> KWHzl;
    public final boolean OLrzqt;
    public final C59534zip copydefault;

    public static final boolean EZpvd() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59534zip AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<?> AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.util.List<?> list) {
        this.KWHzl = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C46797tdu<?>> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC46790tdn copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.util.List<C46797tdu<?>> list) {
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46796tdt djBIcL() {
        return this.AhwBna;
    }

    public C46802tdz(@NotNull C46796tdt c46796tdt, @NotNull C59534zip c59534zip, @NotNull InterfaceC46790tdn interfaceC46790tdn, boolean z, @NotNull Function0<java.lang.Boolean> function0, @NotNull Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(c46796tdt, "");
        Intrinsics.checkNotNullParameter(c59534zip, "");
        Intrinsics.checkNotNullParameter(interfaceC46790tdn, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AhwBna = c46796tdt;
        this.copydefault = c59534zip;
        this.EZpvd = interfaceC46790tdn;
        this.OLrzqt = z;
        C46792tdp.copydefault(c46796tdt, new Activity(function2, this), function1, new TaskDescription(), function0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (r10v0 o.tdt)
  (r11v0 o.zip)
  (r12v0 o.tdn)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:41) call: o.tdw.<init>():void type: CONSTRUCTOR) : (r14v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0014: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:42) call: o.tdy.<init>():void type: CONSTRUCTOR) : (r15v0 kotlin.jvm.functions.Function2))
  (r16v0 kotlin.jvm.functions.Function1)
 A[MD:(o.tdt, o.zip, o.tdn, boolean, kotlin.jvm.functions.Function0<java.lang.Boolean>, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>):void (m)] (LINE:36) call: o.tdz.<init>(o.tdt, o.zip, o.tdn, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C46802tdz(C46796tdt c46796tdt, C59534zip c59534zip, InterfaceC46790tdn interfaceC46790tdn, boolean z, Function0 function0, Function2 function2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c46796tdt, c59534zip, interfaceC46790tdn, (i & 8) != 0 ? false : z, (i & 16) != 0 ? new Function0() { // from class: o.tdw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C46802tdz.EZpvd());
            }
        } : function0, (i & 32) != 0 ? new Function2() { // from class: o.tdy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C46802tdz.OLrzqt(((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
            }
        } : function2, function1);
    }

    public static final Unit OLrzqt(int i, int i2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.tdz$Activity */
    public static final class Activity implements InterfaceC46789tdm {
        public final /* synthetic */ C46802tdz EZpvd;
        public final /* synthetic */ Function2<java.lang.Integer, java.lang.Integer, Unit> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2, C46802tdz c46802tdz) {
            this.OLrzqt = function2;
            this.EZpvd = c46802tdz;
        }

        @Override // o.InterfaceC46789tdm
        public void AEQbTJ(int i, int i2) {
            this.OLrzqt.invoke(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
            java.util.List<C46797tdu<?>> listOLrzqt = this.EZpvd.OLrzqt();
            if (listOLrzqt == null || listOLrzqt.size() <= 0) {
                listOLrzqt = null;
            }
            if (listOLrzqt != null) {
                C46802tdz c46802tdz = this.EZpvd;
                if (i < 0 || i > listOLrzqt.size() || i2 < 0 || i2 > listOLrzqt.size()) {
                    return;
                }
                C46793tdq.copydefault(listOLrzqt, listOLrzqt.get(i), listOLrzqt.get(i2), c46802tdz.AhwBna());
                C59534zip c59534zipAEQbTJ = c46802tdz.AEQbTJ();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                java.util.Iterator<T> it = listOLrzqt.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C46797tdu) it.next()).copydefault());
                }
                c59534zipAEQbTJ.setItems(arrayList);
                c46802tdz.AEQbTJ().notifyItemMoved(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: o.tdz$TaskDescription */
    public static final class TaskDescription implements InterfaceC46794tdr {
        public static final int copydefault() {
            return -1;
        }

        public TaskDescription() {
        }

        @Override // o.InterfaceC46794tdr
        public void KWHzl(int i) {
            java.lang.Object objM7377constructorimpl;
            C46797tdu c46797tdu;
            C46802tdz c46802tdz = C46802tdz.this;
            c46802tdz.copydefault(c46802tdz.djBIcL(), false);
            C46802tdz.this.djBIcL().setNestedScrollingEnabled(false);
            InterfaceC46790tdn interfaceC46790tdnCopydefault = C46802tdz.this.copydefault();
            C46802tdz c46802tdz2 = C46802tdz.this;
            try {
                Result.Application application = Result.Companion;
                java.util.List<?> items = c46802tdz2.AEQbTJ().getItems();
                objM7377constructorimpl = Result.m7377constructorimpl(items != null ? items.get(i) : null);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            interfaceC46790tdnCopydefault.EZpvd(i, Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            C46802tdz c46802tdz3 = C46802tdz.this;
            c46802tdz3.KWHzl(c46802tdz3.AEQbTJ().getItems());
            C46802tdz c46802tdz4 = C46802tdz.this;
            java.util.List<?> items2 = c46802tdz4.AEQbTJ().getItems();
            Intrinsics.checkNotNullExpressionValue(items2, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(items2, 10));
            int i2 = 0;
            for (final java.lang.Object obj : items2) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                if (obj instanceof CoinQuote) {
                    c46797tdu = new C46797tdu(obj, C56392yDr.copydefault(new Function0() { // from class: o.tdx
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return java.lang.Integer.valueOf(C46802tdz.TaskDescription.copydefault(obj));
                        }
                    }), i2, false);
                } else {
                    c46797tdu = new C46797tdu(obj, C56392yDr.copydefault(new Function0() { // from class: o.tdv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return java.lang.Integer.valueOf(C46802tdz.TaskDescription.copydefault());
                        }
                    }), i2, false);
                }
                arrayList.add(c46797tdu);
                i2++;
            }
            c46802tdz4.copydefault(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList));
        }

        public static final int copydefault(java.lang.Object obj) {
            java.lang.Integer num = C46752tdB.KWHzl().get(((CoinQuote) obj).getInstType());
            if (num != null) {
                return num.intValue();
            }
            return -2;
        }

        @Override // o.InterfaceC46794tdr
        public void AEQbTJ() {
            java.util.ArrayList arrayList;
            java.util.List<C46797tdu<?>> listOLrzqt = C46802tdz.this.OLrzqt();
            if (listOLrzqt != null) {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                java.util.Iterator<T> it = listOLrzqt.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C46797tdu) it.next()).copydefault());
                }
            } else {
                arrayList = null;
            }
            C46802tdz.this.copydefault().AEQbTJ(arrayList, !Intrinsics.EZpvd(C46802tdz.this.AYXKKw(), arrayList));
            C46802tdz.this.djBIcL().setNestedScrollingEnabled(true);
            C46802tdz c46802tdz = C46802tdz.this;
            c46802tdz.copydefault(c46802tdz.djBIcL(), true);
        }
    }

    public final void copydefault(android.view.View view, boolean z) {
        for (android.view.ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewPager2) {
                ((ViewPager2) parent).setUserInputEnabled(z);
            }
        }
    }
}
