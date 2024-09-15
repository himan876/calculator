document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('core-form');
    const coreModelInput = document.getElementById('coreModel');
    const coreVolumeSpan = document.getElementById('coreVolume');
    const effectiveVolumeSpan = document.getElementById('effectiveVolume');
    const effectiveLengthSpan = document.getElementById('effectiveLength');
    const effectiveAreaSpan = document.getElementById('effectiveArea');
    const minAreaSpan = document.getElementById('minArea');

    form.addEventListener('submit', async (event) => {
        event.preventDefault();

        const coreModel = coreModelInput.value;
        const response = await fetch(`/calculate?coreModel=${encodeURIComponent(coreModel)}`);
        
        if (!response.ok) {
            alert('Failed to fetch data');
            return;
        }

        const data = await response.json();
        coreVolumeSpan.textContent = data.coreVolume;
        effectiveVolumeSpan.textContent = data.effectiveVolume;
        effectiveLengthSpan.textContent = data.effectiveLength;
        effectiveAreaSpan.textContent = data.effectiveArea;
        minAreaSpan.textContent = data.minArea;
    });
});
