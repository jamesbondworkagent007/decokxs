package o;

import android.graphics.drawable.BitmapDrawable;
import o.yCX;

/* JADX INFO: loaded from: classes19.dex */
public class yCQ {
    public static final java.lang.String EZpvd = "Blurry";

    public static class TaskDescription {

        public interface StateListAnimator {
            void onImageReady(BitmapDrawable bitmapDrawable);
        }
    }

    public static ActionBar KWHzl(android.content.Context context) {
        return new ActionBar(context);
    }

    public static class ActionBar {
        public yCY AEQbTJ;
        public android.view.View EZpvd;
        public android.content.Context KWHzl;
        public int OLrzqt = 300;
        public boolean copydefault;
        public TaskDescription.StateListAnimator djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar EZpvd(TaskDescription.StateListAnimator stateListAnimator) {
            this.copydefault = true;
            this.djBIcL = stateListAnimator;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar KWHzl() {
            this.copydefault = true;
            return this;
        }

        public ActionBar(android.content.Context context) {
            this.KWHzl = context;
            android.view.View view = new android.view.View(context);
            this.EZpvd = view;
            view.setTag(yCQ.EZpvd);
            this.AEQbTJ = new yCY();
        }

        public ActionBar EZpvd(int i) {
            this.AEQbTJ.KWHzl = i;
            return this;
        }

        public ActionBar AEQbTJ(int i) {
            this.AEQbTJ.AEQbTJ = i;
            return this;
        }

        public Application AEQbTJ(android.graphics.Bitmap bitmap) {
            return new Application(this.KWHzl, bitmap, this.AEQbTJ, this.copydefault, this.djBIcL);
        }
    }

    public static class Application {
        public yCY AEQbTJ;
        public boolean EZpvd;
        public android.graphics.Bitmap KWHzl;
        public TaskDescription.StateListAnimator OLrzqt;
        public android.content.Context copydefault;

        public Application(android.content.Context context, android.graphics.Bitmap bitmap, yCY ycy, boolean z, TaskDescription.StateListAnimator stateListAnimator) {
            this.copydefault = context;
            this.KWHzl = bitmap;
            this.AEQbTJ = ycy;
            this.EZpvd = z;
            this.OLrzqt = stateListAnimator;
        }

        public void OLrzqt(final android.widget.ImageView imageView) {
            this.AEQbTJ.OLrzqt = this.KWHzl.getWidth();
            this.AEQbTJ.EZpvd = this.KWHzl.getHeight();
            if (this.EZpvd) {
                new yCX(imageView.getContext(), this.KWHzl, this.AEQbTJ, new yCX.Activity() { // from class: o.yCQ.Application.1
                    @Override // o.yCX.Activity
                    public void EZpvd(BitmapDrawable bitmapDrawable) {
                        if (Application.this.OLrzqt != null) {
                            Application.this.OLrzqt.onImageReady(bitmapDrawable);
                        } else {
                            imageView.setImageDrawable(bitmapDrawable);
                        }
                    }
                }).copydefault();
            } else {
                imageView.setImageDrawable(new BitmapDrawable(this.copydefault.getResources(), yCV.OLrzqt(imageView.getContext(), this.KWHzl, this.AEQbTJ)));
            }
        }
    }
}
