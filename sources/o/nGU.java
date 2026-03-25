package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.im.imui.conversationlist.provider.ConversationListFilterChipsType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35897oHt;
import o.nGU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nGU implements InterfaceC35897oHt<java.lang.Object> {
    public Function1<? super ConversationListFilterChipsType, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.im.imui.conversationlist.provider.ConversationListFilterChipsType, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.im.imui.conversationlist.provider.ConversationListFilterChipsType, kotlin.Unit> */
    public final Function1<ConversationListFilterChipsType, Unit> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super ConversationListFilterChipsType, Unit> function1) {
        this.KWHzl = function1;
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
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C33948nLu c33948nLuCopydefault = C33948nLu.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c33948nLuCopydefault, "");
        return new Application(this, c33948nLuCopydefault);
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if ((obj instanceof nGI) && (c35895oHr instanceof Application)) {
            ((Application) c35895oHr).OLrzqt((nGI) obj);
        }
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof nGI;
    }

    public final class Application extends C35895oHr {
        public final C33948nLu OLrzqt;
        public final /* synthetic */ nGU copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull nGU ngu, C33948nLu c33948nLu) {
            super(c33948nLu.getRoot().getContext(), c33948nLu.getRoot());
            Intrinsics.checkNotNullParameter(c33948nLu, "");
            this.copydefault = ngu;
            this.OLrzqt = c33948nLu;
        }

        public final void OLrzqt(@NotNull final nGI ngi) {
            Intrinsics.checkNotNullParameter(ngi, "");
            this.OLrzqt.EZpvd.setSelected(ngi.KWHzl() == ConversationListFilterChipsType.ALL);
            this.OLrzqt.values.setSelected(ngi.KWHzl() == ConversationListFilterChipsType.UNREAD);
            this.OLrzqt.AEQbTJ.setSelected(ngi.KWHzl() == ConversationListFilterChipsType.FLAGGED);
            C54989xbV c54989xbV = this.OLrzqt.EZpvd;
            final nGU ngu = this.copydefault;
            c54989xbV.setOnClickListener(new View.OnClickListener() { // from class: o.nGY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nGU.Application.OLrzqt(ngu, this, view);
                }
            });
            C55380xip.setBadgeNumber$default(this.OLrzqt.values.copydefault(), ngi.AEQbTJ(), 0, 2, null);
            C54989xbV c54989xbV2 = this.OLrzqt.values;
            final nGU ngu2 = this.copydefault;
            c54989xbV2.setOnClickListener(new View.OnClickListener() { // from class: o.nHd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nGU.Application.copydefault(ngu2, this, ngi, view);
                }
            });
            ConstraintLayout constraintLayout = this.OLrzqt.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility((this.OLrzqt.values.isSelected() && ngi.AEQbTJ() == 0) ? 0 : 8);
            C55380xip.setBadgeNumber$default(this.OLrzqt.AEQbTJ.copydefault(), ngi.copydefault(), 0, 2, null);
            C54989xbV c54989xbV3 = this.OLrzqt.AEQbTJ;
            final nGU ngu3 = this.copydefault;
            c54989xbV3.setOnClickListener(new View.OnClickListener() { // from class: o.nHb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nGU.Application.KWHzl(ngu3, this, ngi, view);
                }
            });
            ConstraintLayout constraintLayout2 = this.OLrzqt.valueOf;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility((this.OLrzqt.AEQbTJ.isSelected() && ngi.OLrzqt() == 0) ? 0 : 8);
        }

        public static final void OLrzqt(nGU ngu, Application application, android.view.View view) {
            Function1<ConversationListFilterChipsType, Unit> function1AEQbTJ = ngu.AEQbTJ();
            if (function1AEQbTJ != null) {
                function1AEQbTJ.invoke(ConversationListFilterChipsType.ALL);
            }
            ConstraintLayout constraintLayout = application.OLrzqt.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            ConstraintLayout constraintLayout2 = application.OLrzqt.valueOf;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
            application.OLrzqt.EZpvd.setSelected(true);
            application.OLrzqt.values.setSelected(false);
            application.OLrzqt.AEQbTJ.setSelected(false);
        }

        public static final void copydefault(nGU ngu, final Application application, nGI ngi, android.view.View view) {
            Function1<ConversationListFilterChipsType, Unit> function1AEQbTJ = ngu.AEQbTJ();
            if (function1AEQbTJ != null) {
                function1AEQbTJ.invoke(ConversationListFilterChipsType.UNREAD);
            }
            application.OLrzqt.EZpvd.setSelected(false);
            application.OLrzqt.values.setSelected(true);
            application.OLrzqt.AEQbTJ.setSelected(false);
            ConstraintLayout constraintLayout = application.OLrzqt.valueOf;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            if (ngi.AEQbTJ() == 0) {
                application.OLrzqt.gEmmrt.postDelayed(new java.lang.Runnable() { // from class: o.nGZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        nGU.Application.copydefault(this.KWHzl);
                    }
                }, 100L);
            }
        }

        public static final void copydefault(Application application) {
            ConstraintLayout constraintLayout = application.OLrzqt.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
        }

        public static final void KWHzl(nGU ngu, final Application application, nGI ngi, android.view.View view) {
            Function1<ConversationListFilterChipsType, Unit> function1AEQbTJ = ngu.AEQbTJ();
            if (function1AEQbTJ != null) {
                function1AEQbTJ.invoke(ConversationListFilterChipsType.FLAGGED);
            }
            application.OLrzqt.EZpvd.setSelected(false);
            application.OLrzqt.values.setSelected(false);
            application.OLrzqt.AEQbTJ.setSelected(true);
            ConstraintLayout constraintLayout = application.OLrzqt.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            if (ngi.OLrzqt() == 0) {
                application.OLrzqt.valueOf.postDelayed(new java.lang.Runnable() { // from class: o.nGV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        nGU.Application.AEQbTJ(this.AEQbTJ);
                    }
                }, 100L);
            }
        }

        public static final void AEQbTJ(Application application) {
            ConstraintLayout constraintLayout = application.OLrzqt.valueOf;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
        }
    }
}
