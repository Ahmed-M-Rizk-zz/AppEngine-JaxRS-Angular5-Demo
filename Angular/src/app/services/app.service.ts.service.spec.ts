import {TestBed, inject} from '@angular/core/testing';

import {SecertService} from './app.service.ts.service';

describe('App.Service.TsService', () => {
    beforeEach(() => {
        TestBed.configureTestingModule({
            providers: [SecertService]
        });
    });

    it('should be created', inject([SecertService], (service: SecertService) => {
        expect(service).toBeTruthy();
    }));
});
