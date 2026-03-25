package o;

import android.view.View;
import com.okinc.im.imui.conversationlist.model.ConversationListSectionHeaderType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nHc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33822nHc implements InterfaceC35897oHt<java.lang.Object> {
    public Function0<Unit> AEQbTJ;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<Unit> function0) {
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, obj, list);
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if ((obj instanceof nGH) && (c35895oHr instanceof Activity)) {
            ((Activity) c35895oHr).OLrzqt((nGH) obj);
        }
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C33951nLx c33951nLxEZpvd = C33951nLx.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c33951nLxEZpvd, "");
        return new Activity(this, c33951nLxEZpvd);
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof nGH;
    }

    /* JADX INFO: renamed from: o.nHc$Activity */
    public final class Activity extends C35895oHr {
        public final C33951nLx KWHzl;
        public final /* synthetic */ C33822nHc OLrzqt;

        /* JADX INFO: renamed from: o.nHc$Activity$ActionBar */
        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ConversationListSectionHeaderType.values().length];
                try {
                    iArr[ConversationListSectionHeaderType.SUGGESTED.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[ConversationListSectionHeaderType.TRENDING_GROUPS.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[ConversationListSectionHeaderType.MY_CHATS.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C33822nHc c33822nHc, C33951nLx c33951nLx) {
            super(c33951nLx.getRoot().getContext(), c33951nLx.getRoot());
            Intrinsics.checkNotNullParameter(c33951nLx, "");
            this.OLrzqt = c33822nHc;
            this.KWHzl = c33951nLx;
        }

        public final void OLrzqt(@NotNull nGH ngh) {
            java.lang.String strAYXKKw;
            Intrinsics.checkNotNullParameter(ngh, "");
            android.widget.TextView textView = this.KWHzl.AEQbTJ;
            ConversationListSectionHeaderType conversationListSectionHeaderTypeOLrzqt = ngh.OLrzqt();
            int[] iArr = ActionBar.EZpvd;
            int i = iArr[conversationListSectionHeaderTypeOLrzqt.ordinal()];
            if (i == 1) {
                strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.RZMhtF);
            } else if (i == 2) {
                strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.RcLksq);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.apNKau);
            }
            textView.setText(strAYXKKw);
            if (iArr[ngh.OLrzqt().ordinal()] == 2) {
                if (!oGU.KWHzl.copydefault()) {
                    android.widget.TextView textView2 = this.KWHzl.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setVisibility(ngh.KWHzl() > 10 ? 0 : 8);
                    android.widget.ImageView imageView = this.KWHzl.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    imageView.setVisibility(0);
                    android.widget.TextView textView3 = this.KWHzl.KWHzl;
                    textView3.setOnClickListener(new TaskDescription(textView3, 1000L, this.OLrzqt));
                    android.widget.ImageView imageView2 = this.KWHzl.OLrzqt;
                    imageView2.setOnClickListener(new Application(imageView2, 1000L, this.OLrzqt));
                    return;
                }
                android.widget.TextView textView4 = this.KWHzl.KWHzl;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(8);
                android.widget.ImageView imageView3 = this.KWHzl.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(8);
                return;
            }
            android.widget.TextView textView5 = this.KWHzl.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            textView5.setVisibility(8);
            android.widget.ImageView imageView4 = this.KWHzl.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView4, "");
            imageView4.setVisibility(8);
            this.KWHzl.KWHzl.setOnClickListener(null);
            this.KWHzl.OLrzqt.setOnClickListener(null);
        }

        /* JADX INFO: renamed from: o.nHc$Activity$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C33822nHc KWHzl;
            public final /* synthetic */ long OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, C33822nHc c33822nHc) {
                this.AEQbTJ = view;
                this.OLrzqt = j;
                this.KWHzl = c33822nHc;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    Function0<Unit> function0AEQbTJ = this.KWHzl.AEQbTJ();
                    if (function0AEQbTJ != null) {
                        function0AEQbTJ.invoke();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.nHc$Activity$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ C33822nHc KWHzl;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, C33822nHc c33822nHc) {
                this.EZpvd = view;
                this.copydefault = j;
                this.KWHzl = c33822nHc;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    Function0<Unit> function0Copydefault = this.KWHzl.copydefault();
                    if (function0Copydefault != null) {
                        function0Copydefault.invoke();
                    }
                }
            }
        }
    }
}
