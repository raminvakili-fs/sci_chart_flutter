package com.example.flutter_sci_chart_plugin.sci;

import android.content.Context;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

public class InteractingAnnotationFactory extends PlatformViewFactory {
    private final BinaryMessenger messenger;

    public InteractingAnnotationFactory(BinaryMessenger messenger) {
        super(StandardMessageCodec.INSTANCE);
        this.messenger = messenger;
    }

    @Override
    public PlatformView create(Context context, int id, Object o) {
        return new FlutterInteractingAnnotation(context, messenger, id);
    }
}
