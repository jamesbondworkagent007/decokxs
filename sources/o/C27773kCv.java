package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import com.okinc.business.market.features.watch_list_groups.ui.binder.TokenGroupSelectionItemBinder$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kCv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27773kCv extends AbstractC25436iwg<CommonGroupUiModel, C23468hym> {
    public static final Activity Companion = new Activity(null);
    public final boolean EZpvd;
    public final Function1<CommonGroupUiModel, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27773kCv() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:17) call: o.kCA.<init>():void type: CONSTRUCTOR) : (r2v0 kotlin.jvm.functions.Function1))
 A[MD:(boolean, kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.group.domain.CommonGroupUiModel, kotlin.Unit>):void (m)] (LINE:15) call: o.kCv.<init>(boolean, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C27773kCv(boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? new Function1() { // from class: o.kCA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27773kCv.EZpvd((CommonGroupUiModel) obj);
            }
        } : function1);
    }

    public static final Unit EZpvd(CommonGroupUiModel commonGroupUiModel) {
        Intrinsics.checkNotNullParameter(commonGroupUiModel, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.group.domain.CommonGroupUiModel, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27773kCv(boolean z, @NotNull Function1<? super CommonGroupUiModel, Unit> function1) {
        super(TokenGroupSelectionItemBinder$2.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = z;
        this.copydefault = function1;
    }

    /* JADX INFO: renamed from: o.kCv$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kCv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C23468hym> c25435iwf, @NotNull CommonGroupUiModel commonGroupUiModel) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(commonGroupUiModel, "");
        C23468hym c23468hym = (C23468hym) c25435iwf.EZpvd();
        boolean zCopydefault = C33129mqd.copydefault((java.lang.Object) java.lang.Integer.valueOf(commonGroupUiModel.OLrzqt()), (java.lang.Object) 200);
        int iKWHzl = C25382ivf.KWHzl(zCopydefault ? C52761wXj.Activity.UlJrfe : C52761wXj.Activity.fdOvFl);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(iKWHzl);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) (commonGroupUiModel.EZpvd() + " (" + commonGroupUiModel.OLrzqt() + ")"));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        c23468hym.EZpvd.setText(new android.text.SpannedString(spannableStringBuilder));
        c23468hym.copydefault.setSelected(commonGroupUiModel.copydefault());
        android.widget.ImageView imageView = c23468hym.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C25352ivB.toggleSelectionState$default(imageView, commonGroupUiModel.copydefault(), this.EZpvd, null, C25382ivf.KWHzl(C52761wXj.Activity.OJuSTm), null, 0, 52, null);
        LinearLayoutCompat root = c23468hym.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, zCopydefault, commonGroupUiModel, this));
    }

    /* JADX INFO: renamed from: o.kCv$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ CommonGroupUiModel AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ C27773kCv OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, boolean z, CommonGroupUiModel commonGroupUiModel, C27773kCv c27773kCv) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = z;
            this.AEQbTJ = commonGroupUiModel;
            this.OLrzqt = c27773kCv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (!this.KWHzl || this.AEQbTJ.copydefault()) {
                    this.OLrzqt.copydefault.invoke(CommonGroupUiModel.copy$default(this.AEQbTJ, 0, null, 0, 0, 0, !r0.copydefault(), false, 95, null));
                }
            }
        }
    }
}
