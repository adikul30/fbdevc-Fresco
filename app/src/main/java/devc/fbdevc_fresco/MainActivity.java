package devc.fbdevc_fresco;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Initialize Fresco class once
        Fresco.initialize(this);

        setContentView(R.layout.activity_main);

        //quality of the image starts out low and gradually becomes clearer
        Uri fresco_image  = Uri.parse("https://raw.githubusercontent.com/adikul30/fbdevc-Fresco/master/images/rsz_1rsz_1rsz_1rsz_og_image.png");
        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.fresco_image);
        ImageRequest request = ImageRequestBuilder.newBuilderWithSource(fresco_image)
                .setProgressiveRenderingEnabled(true)
                .build();
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setImageRequest(request)
                .setOldController(draweeView.getController())
                .build();
        draweeView.setController(controller);

        Uri tech_image = Uri.parse("https://scontent.fbom1-1.fna.fbcdn.net/v/t39.2365-6/12056943_1156711601009106_1768363897_n.jpg?oh=5fc44bb3eabdafd9dcd4547e143930c7&oe=594EB242");
        SimpleDraweeView techdraweeView = (SimpleDraweeView) findViewById(R.id.abstract_tech);
        techdraweeView.setImageURI(tech_image);

        Uri monitor_image = Uri.parse("https://static.xx.fbcdn.net/rsrc.php/v1/y1/r/jzLlxKpB0yz.jpg");
        SimpleDraweeView monitordraweeView = (SimpleDraweeView) findViewById(R.id.monitor_image);
        monitordraweeView.setImageURI(monitor_image);

        Uri wallart_image = Uri.parse("https://static.xx.fbcdn.net/rsrc.php/v1/yB/r/i9VUkiHf940.jpg");
        SimpleDraweeView wallartdraweeView = (SimpleDraweeView) findViewById(R.id.wallart_image);
        wallartdraweeView.setImageURI(wallart_image);
        //GIF display
        SimpleDraweeView materialgif = (SimpleDraweeView) findViewById(R.id.material_gif);

        Uri material_gif = Uri.parse("https://assets.materialup.com/uploads/67f0328a-9784-480c-a592-8b036c2eaaf8/animation.gif");
        DraweeController controller2 = Fresco.newDraweeControllerBuilder()
                .setUri(material_gif)
                //Autoplaying GIF whenever it comes on screen
                .setAutoPlayAnimations(true)
                .build();
        materialgif.setController(controller2);

    }
}
